package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.core.VideoFloaterToCamera;
import com.example.bs.entity.VideoFloater;
import com.example.bs.service.VideoFloaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videoFloater")
public class VideoFloaterController {
    @Autowired
    private VideoFloaterService videoFloaterService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<VideoFloaterToCamera> existVideoFloater=videoFloaterService.selectAll();
        result.setData(existVideoFloater);
        return result;
    }

}
