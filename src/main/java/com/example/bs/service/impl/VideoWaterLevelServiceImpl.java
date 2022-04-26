package com.example.bs.service.impl;

import com.example.bs.core.VideoWaterLevelToCameraAndRuler;
import com.example.bs.entity.VideoWaterLevel;
import com.example.bs.mapper.VideoWaterLevelMapper;
import com.example.bs.service.VideoWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VideoWaterLevelServiceImpl implements VideoWaterLevelService {
    @Autowired
    private VideoWaterLevelMapper videoWaterLevelMapper;

    @Override
    public List<VideoWaterLevelToCameraAndRuler> selectAll(){
        return videoWaterLevelMapper.selectAll();
    }

}
