package com.example.bs.core;

import lombok.Data;

@Data
public class UserLoginView {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userCard;

    private String userAddr;

    private String userAddrDetail;

    private String userCode;

    private Integer userRoleId;
}
