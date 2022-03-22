package com.example.bs.service.impl;

import com.example.bs.entity.UserInfo;
import com.example.bs.mapper.UserInfoMapper;
import com.example.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectUserByName(String userName){
        return userInfoMapper.selectUserByName(userName);
    }
}
