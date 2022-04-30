package com.example.bs.controller;

import com.example.bs.core.PictureWaterLevelToCameraAndRuler;
import com.example.bs.core.Result;
import com.example.bs.entity.PictureWaterLevel;
import com.example.bs.entity.VideoWaterLevel;
import com.example.bs.service.PictureWaterLevelService;
import com.example.bs.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pictureWaterLevel")
public class PictureWaterLevelController {
    @Autowired
    private PictureWaterLevelService pictureWaterLevelService;

    @Autowired
    UploadFileService uploadFileService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<PictureWaterLevelToCameraAndRuler> existPictureWaterLevel=pictureWaterLevelService.selectAll();
        result.setData(existPictureWaterLevel);
        return result;
    }

    @PostMapping("/uploadPictureWaterLevel")
    @ResponseBody
    public Result uploadPicture(@RequestParam("file") MultipartFile file,
                                @RequestParam("pictureId") Integer pictureId) {
        System.out.println("...........");
        Result result = new Result();
        try {
            String path = uploadFileService.uploadPicture(file,pictureId);
            result.setCode(200);
            result.setData(path);
            System.out.println("文件返回路径:"+path);
            return result;
        } catch (Exception e) {
            result.setCode(400);
            result.setMsg(e.getMessage());
            e.printStackTrace();
            return result;
        }
    }

    @RequestMapping(value = ("/add"), method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody(required = false) PictureWaterLevel row) {
        System.out.println("请求添加水位图片");
        Result result = new Result();
        try {
            pictureWaterLevelService.add(row);
            result.setCode(200);
            return result;
        } catch (Exception e) {
            result.setCode(400);
            return result;
        }
    }

}
