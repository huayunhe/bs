package com.example.bs.mapper;

import com.example.bs.entity.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(Video row);

    int insertSelective(Video row);

    Video selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(Video row);

    int updateByPrimaryKey(Video row);

    List<Video> selectAll();
}