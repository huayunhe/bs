package com.example.bs.service;

public interface UserRoleInfoRelationService {
    //为用户添加角色
    int addUserToRole(Integer userId,Integer roleId) throws Exception;
    //为用户删除角色
    int deleteUserToRole(Integer userId,Integer roleId) throws Exception;
}
