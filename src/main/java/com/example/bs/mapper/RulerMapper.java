package com.example.bs.mapper;

import com.example.bs.core.RulerToCamera;
import com.example.bs.entity.Ruler;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RulerMapper {
    int deleteByPrimaryKey(Integer rulerId);

    int insert(Ruler row);

    int insertSelective(Ruler row);

    Ruler selectByPrimaryKey(Integer rulerId);

    int updateByPrimaryKeySelective(Ruler row);

    int updateByPrimaryKey(Ruler row);

    List<RulerToCamera> selectRulerToCameraAll();
}