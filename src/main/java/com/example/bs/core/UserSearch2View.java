package com.example.bs.core;

import lombok.Data;

/**
 * 用户管理页面搜索
 */
@Data
public class UserSearch2View {
    private String userInput;
    private String phoneInput;
    private String cardInput;
    private String addrInput;
}
