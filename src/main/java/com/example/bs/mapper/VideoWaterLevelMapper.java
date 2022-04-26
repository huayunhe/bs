package com.example.bs.mapper;

import com.example.bs.core.VideoWaterLevelToCameraAndRuler;
import com.example.bs.entity.VideoWaterLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoWaterLevelMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(VideoWaterLevel row);

    int insertSelective(VideoWaterLevel row);

    VideoWaterLevel selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(VideoWaterLevel row);

    int updateByPrimaryKey(VideoWaterLevel row);

    List<VideoWaterLevelToCameraAndRuler> selectAll();
}