package com.example.bs.mapper;

import com.example.bs.core.VideoFloaterToCamera;
import com.example.bs.entity.VideoFloater;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoFloaterMapper {
    int deleteByPrimaryKey(Integer videoFloaterId);

    int insert(VideoFloater row);

    int insertSelective(VideoFloater row);

    VideoFloater selectByPrimaryKey(Integer videoFloaterId);

    int updateByPrimaryKeySelective(VideoFloater row);

    int updateByPrimaryKey(VideoFloater row);

    List<VideoFloaterToCamera> selectAll();
}