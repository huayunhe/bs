package com.example.bs.service.impl;

import com.example.bs.core.PictureWaterLevelToCameraAndRuler;
import com.example.bs.entity.PictureWaterLevel;
import com.example.bs.entity.VideoWaterLevel;
import com.example.bs.mapper.PictureWaterLevelMapper;
import com.example.bs.service.PictureWaterLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PictureWaterLevelServiceImpl implements PictureWaterLevelService {
    @Autowired
    private PictureWaterLevelMapper pictureWaterLevelMapper;

    @Override
    public List<PictureWaterLevelToCameraAndRuler> selectAll(){
        return pictureWaterLevelMapper.selectAll();
    }

    @Override
    public int add(PictureWaterLevel row) {
        return pictureWaterLevelMapper.insert(row);
    }
}
