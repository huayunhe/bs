package com.example.bs.service;

import com.example.bs.entity.UserInfo;

public interface UserService {
    UserInfo selectUserByName(String userName);
}