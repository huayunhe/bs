package com.example.bs.service;

import com.example.bs.core.VideoFloaterToCamera;
import com.example.bs.entity.VideoFloater;

import java.util.List;

public interface VideoFloaterService {
    List<VideoFloaterToCamera> selectAll();
    int add(VideoFloater row) throws Exception;
}
