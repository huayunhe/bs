package com.example.bs.service;

import com.example.bs.entity.UserRole;

import java.util.List;

/**
 * 用户与岗位的分配.
 */
public interface UserRoleService {
    List<UserRole> listAllRoles();
    int addNewRole(UserRole userRole) throws Exception;
    int delRole(Integer roleId) throws Exception;//删除
    int editRole(UserRole userRole) throws Exception;//编辑
}
