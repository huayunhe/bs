package com.example.bs.mapper;

import com.example.bs.entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(UserRole row);

    int insertSelective(UserRole row);

    UserRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(UserRole row);

    int updateByPrimaryKey(UserRole row);
}