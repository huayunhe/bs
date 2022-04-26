package com.example.bs.service;

import com.example.bs.core.VideoWaterLevelToCameraAndRuler;
import com.example.bs.entity.VideoWaterLevel;

import java.util.List;

public interface VideoWaterLevelService {
    List<VideoWaterLevelToCameraAndRuler> selectAll();
}
