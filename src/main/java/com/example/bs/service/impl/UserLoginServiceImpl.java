package com.example.bs.service.impl;

import com.example.bs.core.UserLoginView;
import com.example.bs.entity.UserInfo;
import com.example.bs.entity.UserRoleInfoRelation;
import com.example.bs.mapper.UserInfoMapper;
import com.example.bs.mapper.UserRoleInfoRelationMapper;
import com.example.bs.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginService{
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserRoleInfoRelationMapper userRoleInfoRelationMapper;

    @Override
    public UserLoginView userLogin(String userName, String userPassword) throws Exception{
        UserInfo userInfo = new UserInfo();
        userInfo = userInfoMapper.selectUserByName(userName);
        UserRoleInfoRelation userRoleInfoRelation = userRoleInfoRelationMapper.selectByUserId(userInfo.getUserId());
        UserLoginView userLoginView = new UserLoginView();
        userLoginView.setUserId(userInfo.getUserId());
        userLoginView.setUserPhone(userInfo.getUserPhone());
        userLoginView.setUserName(userInfo.getUserName());

        userLoginView.setUserRoleId(userRoleInfoRelation.getRoleId());
        if(userInfo == null)
        {
            throw new Exception("该用户不存在，请重新输入");
        }
        if(!userInfo.getUserPassword().equals(userPassword))
        {
            throw new Exception("密码错误，请重新输入");
        }
        if(userLoginView.getUserRoleId() == null)
        {
            throw new Exception("该用户未分配权限，请联系管理员处理");
        }
        System.out.println("userLogin:"+userLoginView.toString());
        return userLoginView;
    }
}
