package com.lamarsan.provider.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

/**
 * className: MongDBConf
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 17:37
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
@EnableMongoRepositories(basePackages = "com.lamarsan.provider.mongo.dao")
public class MongDBConf {
    @Value("${spring.data.mongodb.username}")
    private String username;
    @Value("${spring.data.mongodb.password}")
    private String password;
    @Value("${spring.data.mongodb.database}")
    private String database;
    @Value("${spring.data.mongodb.host}")
    private String host;
    @Value("${spring.data.mongodb.port}")
    private String port;

    @Bean
    public MongoClient mongoClient(){
        String username = this.username;
        String password = this.password;
        String database = this.database;
        String host = this.host;
        Integer port = Integer.valueOf(this.port);
        ServerAddress serverAddress = new ServerAddress(host,port);
        MongoCredential mongoCredential = MongoCredential.createCredential(username, database, password.toCharArray());
        List<MongoCredential> mongoCredentialList = new ArrayList<MongoCredential>();
        mongoCredentialList.add(mongoCredential);

        return new MongoClient(serverAddress,mongoCredentialList);
    }

    @Bean
    public MongoDbFactory mongoDbFactory(){
        String database = this.database;
        return new SimpleMongoDbFactory(mongoClient(),database);
    }

    @Bean
    public MongoTemplate mongoTemplate(){

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
}
