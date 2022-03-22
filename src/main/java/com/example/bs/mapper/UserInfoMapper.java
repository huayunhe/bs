package com.example.bs.mapper;

import com.example.bs.entity.UserInfo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo row);

    int insertSelective(UserInfo row);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo row);

    int updateByPrimaryKey(UserInfo row);

    UserInfo selectUserByName(String userName);
}