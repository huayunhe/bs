package com.example.bs.service.impl;

import com.example.bs.entity.Camera;
import com.example.bs.mapper.CameraMapper;
import com.example.bs.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CameraServiceImpl implements CameraService {
    @Autowired
    private CameraMapper cameraMapper;

    @Override
    public List<Camera> selectCameraAll(){
        return cameraMapper.selectCameraAll();
    }
}
