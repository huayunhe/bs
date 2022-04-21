package com.example.bs.service.impl;

import com.example.bs.core.UserBaseInfoView;
import com.example.bs.core.UserSearch2View;
import com.example.bs.core.UserSearchView;
import com.example.bs.entity.UserInfo;
import com.example.bs.mapper.UserInfoMapper;
import com.example.bs.mapper.UserMapper;
import com.example.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;              //包含UserMapper

    @Autowired
    private UserMapper userMapper;                      //包含UserInfoMapper

    @Override
    public UserInfo selectUserByPhone(String userPhone){
        return userInfoMapper.selectUserByPhone(userPhone);
    }



    @Override
    public int addUser(UserInfo userInfo) throws Exception {
        userInfo.setUserPassword("123456");//默认密码
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public int delUser(Integer userId) throws Exception {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int editUserInfo(UserInfo userInfo) throws Exception {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public int editUserPassword(Integer userId, String userPassword) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserPassword(userPassword);
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public List<UserBaseInfoView> listAllUsers(UserSearch2View userSearch2View) {
        return userInfoMapper.listAll(userSearch2View);
    }

    @Override
    public List<UserSearchView> listAllRepairUsers() {
        return userMapper.listAllRepairUser();
    }

    @Override
    public List<UserSearchView> listAllCheckUsers() {
        return userMapper.listAllCheckUser();
    }

    @Override
    public List<UserSearchView> listAllUsersWithRole() {
        return userMapper.listAllUsersWithRole();
    }
}
