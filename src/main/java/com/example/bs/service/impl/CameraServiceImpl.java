package com.example.bs.service.impl;

import com.example.bs.core.CameraToVideo;
import com.example.bs.mapper.CameraMapper;
import com.example.bs.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraServiceImpl implements CameraService {
    @Autowired
    private CameraMapper cameraMapper;

    @Override
    public List<CameraToVideo> selectCameraToVideoAll(){
        return cameraMapper.selectCameraToVideoAll();
    }
}
