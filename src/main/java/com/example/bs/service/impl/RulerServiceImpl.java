package com.example.bs.service.impl;

import com.example.bs.core.RulerToCamera;
import com.example.bs.mapper.RulerMapper;
import com.example.bs.service.RulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RulerServiceImpl implements RulerService {

    @Autowired
    private RulerMapper rulerMapper;

    @Override
    public List<RulerToCamera> selectRulerToCameraAll(){
        return rulerMapper.selectRulerToCameraAll();
    }
}
