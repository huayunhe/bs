package com.example.bs.controller;

import com.example.bs.core.CameraToVideo;
import com.example.bs.core.Result;
import com.example.bs.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraService cameraService;

    @GetMapping("/selectCameraToVideoAll")
    @ResponseBody
    public Result selectCameraToVideoAll(){
        Result result = new Result();
        List<CameraToVideo> existCameraToVideos=cameraService.selectCameraToVideoAll();
        result.setData(existCameraToVideos);
        return result;
    }

}
