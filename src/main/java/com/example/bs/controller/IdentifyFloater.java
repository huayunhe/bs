package com.example.bs.controller;

import com.example.bs.core.Result;
import com.example.bs.service.IdentifyFloaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/identifyFloater")
public class IdentifyFloater {
    @Autowired
    private IdentifyFloaterService identifyFloaterService;

    @GetMapping("/identify")
    @ResponseBody
    public Result identify(){
        identifyFloaterService.identifyFloater();
        Result result = new Result();
        result.setCode(200);
        return result;
    }

}
