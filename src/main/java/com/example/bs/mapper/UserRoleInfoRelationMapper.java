package com.example.bs.mapper;

import com.example.bs.entity.UserRoleInfoRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoleInfoRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleInfoRelation row);

    int insertSelective(UserRoleInfoRelation row);

    UserRoleInfoRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleInfoRelation row);

    int updateByPrimaryKey(UserRoleInfoRelation row);

    UserRoleInfoRelation selectByTwoId(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
    UserRoleInfoRelation selectByUserId(@Param("userId") Integer userId);
}