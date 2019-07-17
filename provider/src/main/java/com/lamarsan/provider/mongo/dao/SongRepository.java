package com.lamarsan.provider.mongo.dao;

import com.lamarsan.provider.mongo.entity.SongRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * className: SongRepository
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 17:30
 */
@Repository
public interface SongRepository extends MongoRepository<SongRecord, String> {
}
