package com.example.bs.service.impl;

import com.example.bs.entity.Video;
import com.example.bs.mapper.VideoMapper;
import com.example.bs.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> selectAll(){
        return videoMapper.selectAll();
    }
}
