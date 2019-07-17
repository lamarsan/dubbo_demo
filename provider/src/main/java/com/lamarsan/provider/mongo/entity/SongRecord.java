package com.lamarsan.provider.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * className: SongRecord
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 16:59
 */
@Data
@Document(collection = "student_b_song_record")
public class SongRecord implements Serializable {
    //用户ID
    @Field("user_id")
    private String userId;
    //歌曲ID
    @Field("song_id")
    private String songId;
    //音频key
    @Field("audio_key")
    private String audioKey;
}
