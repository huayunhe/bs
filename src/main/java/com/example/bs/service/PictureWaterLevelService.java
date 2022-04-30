package com.example.bs.service;

import com.example.bs.core.PictureWaterLevelToCameraAndRuler;
import com.example.bs.entity.PictureWaterLevel;

import java.util.List;

public interface PictureWaterLevelService {
    List<PictureWaterLevelToCameraAndRuler> selectAll();
    int add(PictureWaterLevel row);
}
