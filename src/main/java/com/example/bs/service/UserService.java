package com.example.bs.service;

import com.example.bs.core.UserBaseInfoView;
import com.example.bs.core.UserSearch2View;
import com.example.bs.core.UserSearchView;
import com.example.bs.entity.UserInfo;

import java.util.List;

public interface UserService {
    UserInfo selectUserByName(String userName);

    int addUser(UserInfo userInfo) throws Exception;
    int delUser(Integer userId) throws Exception;
    int editUserInfo(UserInfo userInfo) throws Exception;
    int editUserPassword(Integer userId,String userPassword) throws Exception;
    List<UserBaseInfoView> listAllUsers(UserSearch2View userSearch2View);
    List<UserSearchView> listAllRepairUsers();
    List<UserSearchView> listAllCheckUsers();
    List<UserSearchView> listAllUsersWithRole();
}