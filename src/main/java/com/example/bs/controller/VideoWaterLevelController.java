package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.core.VideoWaterLevelToCameraAndRuler;
import com.example.bs.entity.VideoWaterLevel;
import com.example.bs.service.VideoWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videoWaterLevel")
public class VideoWaterLevelController {
    @Autowired
    private VideoWaterLevelService videoWaterLevelService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<VideoWaterLevelToCameraAndRuler> existVideoWaterLevel=videoWaterLevelService.selectAll();
        result.setData(existVideoWaterLevel);
        return result;
    }
}
