package com.example.bs.mapper;

import com.example.bs.core.CameraToVideo;
import com.example.bs.entity.Camera;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CameraMapper {
    int deleteByPrimaryKey(Integer cameraId);

    int insert(Camera row);

    int insertSelective(Camera row);

    Camera selectByPrimaryKey(Integer cameraId);

    int updateByPrimaryKeySelective(Camera row);

    int updateByPrimaryKey(Camera row);

    List<CameraToVideo> selectCameraToVideoAll();
}