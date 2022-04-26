package com.example.bs.controller;


import com.example.bs.core.Result;
import com.example.bs.core.RulerToCamera;
import com.example.bs.entity.Camera;
import com.example.bs.service.RulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ruler")
public class RulerController {
    @Autowired
    private RulerService rulerService;

    @GetMapping("/selectRulerToCameraAll")
    @ResponseBody
    public Result selectRulerToCameraAll(){
        Result result = new Result();
        List<RulerToCamera> existRulerToCameras=rulerService.selectRulerToCameraAll();
        result.setData(existRulerToCameras);
        return result;
    }
}
