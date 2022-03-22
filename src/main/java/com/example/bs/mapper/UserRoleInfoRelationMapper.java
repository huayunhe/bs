package com.example.bs.mapper;

import com.example.bs.entity.UserRoleInfoRelation;

public interface UserRoleInfoRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleInfoRelation row);

    int insertSelective(UserRoleInfoRelation row);

    UserRoleInfoRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleInfoRelation row);

    int updateByPrimaryKey(UserRoleInfoRelation row);
}