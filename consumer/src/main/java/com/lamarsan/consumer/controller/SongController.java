package com.lamarsan.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lamarsan.provider.mongo.entity.SongRecord;
import com.lamarsan.provider.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * className: SongController
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/17 17:27
 */
@RestController
@CrossOrigin
@RequestMapping("/song")
public class SongController {
    @Reference(lazy = true)
    SongService songService;

    @PostMapping("/allSong")
    @ResponseBody
    public List<SongRecord> getAllPerson(){
        System.out.println(songService);
        return songService.findAllSong();
    }
}
