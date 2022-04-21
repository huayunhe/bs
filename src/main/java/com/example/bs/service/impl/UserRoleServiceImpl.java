package com.example.bs.service.impl;

import com.example.bs.entity.UserRole;
import com.example.bs.entity.UserRoleInfoRelation;
import com.example.bs.mapper.UserRoleInfoRelationMapper;
import com.example.bs.mapper.UserRoleMapper;
import com.example.bs.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> listAllRoles() {
        return userRoleMapper.listAllRoles();
    }

    @Override
    public int addNewRole(UserRole userRole) throws Exception {
        return userRoleMapper.insert(userRole);
    }

    @Override
    public int delRole(Integer roleId) throws Exception {
        return userRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int editRole(UserRole userRole) throws Exception {
        return userRoleMapper.updateByPrimaryKeySelective(userRole);
    }
}
