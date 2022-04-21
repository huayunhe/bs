package com.example.bs.service.impl;

import com.example.bs.entity.UserRoleInfoRelation;
import com.example.bs.mapper.UserRoleInfoRelationMapper;
import com.example.bs.service.UserRoleInfoRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserRoleInfoRelationImpl implements UserRoleInfoRelationService {
    @Autowired
    UserRoleInfoRelationMapper userRoleInfoRelationMapper;

    @Override
    public int addUserToRole(Integer userId, Integer roleId) throws Exception {
        UserRoleInfoRelation userRoleInfoRelation = new UserRoleInfoRelation();
        userRoleInfoRelation.setUserId(userId);
        userRoleInfoRelation.setRoleId(roleId);
        return userRoleInfoRelationMapper.insert(userRoleInfoRelation);
    }

    @Override
    public int deleteUserToRole(Integer userId,Integer roleId) throws Exception {
        UserRoleInfoRelation userRoleInfoRelation = userRoleInfoRelationMapper.selectByTwoId(userId,roleId);
        return userRoleInfoRelationMapper.deleteByPrimaryKey(userRoleInfoRelation.getId());
    }
}
