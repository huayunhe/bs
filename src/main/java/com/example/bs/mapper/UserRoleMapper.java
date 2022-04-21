package com.example.bs.mapper;

import com.example.bs.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(UserRole row);

    int insertSelective(UserRole row);

    UserRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(UserRole row);

    int updateByPrimaryKey(UserRole row);

    List<UserRole> listAllRoles();
}