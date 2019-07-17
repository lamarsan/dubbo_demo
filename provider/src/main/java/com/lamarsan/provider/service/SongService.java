package com.lamarsan.provider.service;


import com.lamarsan.provider.mongo.entity.SongRecord;

import java.util.List;

/**
 * className: SongService
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 17:32
 */
public interface SongService {
    List<SongRecord> findAllSong();
}
