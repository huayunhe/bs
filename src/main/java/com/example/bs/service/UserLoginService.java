package com.example.bs.service;

import com.example.bs.core.UserLoginView;

/**
 * 用户的登录
 */
public interface UserLoginService {
    //用户登录
    UserLoginView userLogin(String userPhone, String userPassword) throws Exception;
}
