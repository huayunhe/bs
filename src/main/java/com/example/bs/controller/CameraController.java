package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.entity.Camera;
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

    @GetMapping("/selectCameraAll")
    @ResponseBody
    public Result selectCameraAll(){
        Result result = new Result();
        List<Camera> existCameras=cameraService.selectCameraAll();
        result.setData(existCameras);
        return result;
    }

}
