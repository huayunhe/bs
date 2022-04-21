package com.example.bs.core;

import lombok.Data;

/**
 * 用于选择框的用户搜索
 */
@Data
public class UserSearchView {
    private Integer userId;
    private String userName;
    private Integer userRoleId;
    private String userRoleName;
}
