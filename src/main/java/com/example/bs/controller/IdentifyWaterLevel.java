package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.service.IdentifyWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/identifyWaterLevel")
public class IdentifyWaterLevel {
    @Autowired
    private IdentifyWaterLevelService identifyWaterLevelService;

    @PostMapping("/identify")
    @ResponseBody
    public Result identify(){
        identifyWaterLevelService.identifyWaterLevel();
        Result result = new Result();
        result.setCode(200);
        return result;
    }
}
