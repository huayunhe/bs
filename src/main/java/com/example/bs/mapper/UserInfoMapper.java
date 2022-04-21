package com.example.bs.mapper;

import com.example.bs.core.UserBaseInfoView;
import com.example.bs.core.UserSearch2View;
import com.example.bs.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo row);

    int insertSelective(UserInfo row);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo row);

    int updateByPrimaryKey(UserInfo row);

    UserInfo selectUserByPhone(String userPhone);

    List<UserBaseInfoView> listAll(UserSearch2View userSearch2View);
}