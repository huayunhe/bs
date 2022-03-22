package com.example.bs.mapper;

import com.example.bs.entity.UserInfo;


public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo row);

    int insertSelective(UserInfo row);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo row);

    int updateByPrimaryKey(UserInfo row);

    UserInfo login(UserInfo userInfo);

}