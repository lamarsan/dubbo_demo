package com.lamarsan.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lamarsan.provider.mongo.dao.SongRepository;
import com.lamarsan.provider.mongo.entity.SongRecord;
import com.lamarsan.provider.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * className: SongServiceImpl
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 17:33
 */
@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;

    public List<SongRecord> findAllSong() {
        return songRepository.findAll();
    }
}
