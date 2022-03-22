package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.entity.Video;
import com.example.bs.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<Video> existVideo=videoService.selectAll();
        result.setData(existVideo);
        return result;
    }

}
