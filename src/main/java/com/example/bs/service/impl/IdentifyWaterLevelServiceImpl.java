package com.example.bs.service.impl;

import com.example.bs.service.IdentifyFloaterService;
import com.example.bs.service.IdentifyWaterLevelService;
import org.springframework.stereotype.Service;

@Service
public class IdentifyWaterLevelServiceImpl implements IdentifyWaterLevelService {
    @Override
    public String identifyWaterLevel(){
        return "0";
    }
}
