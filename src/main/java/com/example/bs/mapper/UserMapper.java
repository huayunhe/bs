package com.example.bs.mapper;

import com.example.bs.core.UserSearchView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 多表联接
 */
@Mapper
public interface UserMapper {
    List<UserSearchView> listAllRepairUser();
    List<UserSearchView> listAllCheckUser();
    List<UserSearchView> listAllUsersWithRole();
}
