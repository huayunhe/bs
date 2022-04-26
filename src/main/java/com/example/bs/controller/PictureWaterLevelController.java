package com.example.bs.controller;

import com.example.bs.core.PictureWaterLevelToCameraAndRuler;
import com.example.bs.core.Result;
import com.example.bs.entity.PictureWaterLevel;
import com.example.bs.service.PictureWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pictureWaterLevel")
public class PictureWaterLevelController {
    @Autowired
    private PictureWaterLevelService pictureWaterLevelService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<PictureWaterLevelToCameraAndRuler> existPictureWaterLevel=pictureWaterLevelService.selectAll();
        result.setData(existPictureWaterLevel);
        return result;
    }

}
