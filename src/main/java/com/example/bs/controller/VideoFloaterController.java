package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.core.VideoFloaterToCamera;
import com.example.bs.entity.VideoFloater;
import com.example.bs.service.UploadFileService;
import com.example.bs.service.VideoFloaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videoFloater")
public class VideoFloaterController {
    @Autowired
    private VideoFloaterService videoFloaterService;

    @Autowired
    UploadFileService uploadFileService;

    @GetMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        Result result = new Result();
        List<VideoFloaterToCamera> existVideoFloater=videoFloaterService.selectAll();
        result.setData(existVideoFloater);
        return result;
    }

    @PostMapping("/uploadVideoFloater")
    @ResponseBody
    public Result uploadPicture(@RequestParam("file") MultipartFile file,
                                @RequestParam("videoFloaterId") Integer videoFloaterId) {
        Result result = new Result();
        try {
            String path = uploadFileService.uploadVideoFloater(file,videoFloaterId);
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
    public Result add(@RequestBody(required = false) VideoFloater row) {
        System.out.println("请求添加漂浮物视频");
        Result result = new Result();
        try {
            videoFloaterService.add(row);
            result.setCode(200);
            return result;
        } catch (Exception e) {
            result.setCode(400);
            result.setMsg(e.getMessage());
            return result;
        }
    }

}
