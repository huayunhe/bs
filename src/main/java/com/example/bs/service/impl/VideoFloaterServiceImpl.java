package com.example.bs.service.impl;

import com.example.bs.core.VideoFloaterToCamera;
import com.example.bs.entity.VideoFloater;
import com.example.bs.mapper.VideoFloaterMapper;
import com.example.bs.service.VideoFloaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VideoFloaterServiceImpl implements VideoFloaterService {
    @Autowired
    private VideoFloaterMapper videoFloaterMapper;

    @Override
    public List<VideoFloaterToCamera> selectAll(){
        return videoFloaterMapper.selectAll();
    }
}
