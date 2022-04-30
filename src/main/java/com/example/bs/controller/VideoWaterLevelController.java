package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.core.VideoWaterLevelToCameraAndRuler;
import com.example.bs.entity.VideoFloater;
import com.example.bs.entity.VideoWaterLevel;
import com.example.bs.service.UploadFileService;
import com.example.bs.service.VideoWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videoWaterLevel")
public class VideoWaterLevelController {
    @Autowired
    private VideoWaterLevelService videoWaterLevelService;

    @Autowired
    UploadFileService uploadFileService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<VideoWaterLevelToCameraAndRuler> existVideoWaterLevel=videoWaterLevelService.selectAll();
        result.setData(existVideoWaterLevel);
        return result;
    }

    @PostMapping("/uploadVideoWaterLevel")
    @ResponseBody
    public Result uploadPicture(@RequestParam("file") MultipartFile file,
                                @RequestParam("videoId") Integer videoId) {
        Result result = new Result();
        try {
            String path = uploadFileService.uploadVideoWaterLevel(file,videoId);
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
    public Result add(@RequestBody(required = false) VideoWaterLevel row) {
        System.out.println("请求添加水位视频");
        Result result = new Result();
        try {
            videoWaterLevelService.add(row);
            result.setCode(200);
            return result;
        } catch (Exception e) {
            result.setCode(400);
            return result;
        }
    }
}
