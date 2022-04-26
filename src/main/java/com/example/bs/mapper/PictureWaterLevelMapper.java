package com.example.bs.mapper;

import com.example.bs.core.PictureWaterLevelToCameraAndRuler;
import com.example.bs.entity.PictureWaterLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PictureWaterLevelMapper {
    int deleteByPrimaryKey(Integer pictureId);

    int insert(PictureWaterLevel row);

    int insertSelective(PictureWaterLevel row);

    PictureWaterLevel selectByPrimaryKey(Integer pictureId);

    int updateByPrimaryKeySelective(PictureWaterLevel row);

    int updateByPrimaryKey(PictureWaterLevel row);

    List<PictureWaterLevelToCameraAndRuler> selectAll();
}