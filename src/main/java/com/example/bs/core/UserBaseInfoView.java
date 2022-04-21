package com.example.bs.core;
//用户管理显示的视图
public class UserBaseInfoView {
    private Integer userId;

    private String userName;

    private String userPhone;

//    private String userPassword;

    private String userCard;

    private String userAddr;

    private String userAddrDetail;

    private String userCode;

    public UserBaseInfoView() {
    }

    public UserBaseInfoView(Integer userId, String userName, String userPhone, String userCard, String userAddr, String userAddrDetail, String userCode) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCard = userCard;
        this.userAddr = userAddr;
        this.userAddrDetail = userAddrDetail;
        this.userCode = userCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserAddrDetail() {
        return userAddrDetail;
    }

    public void setUserAddrDetail(String userAddrDetail) {
        this.userAddrDetail = userAddrDetail;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "UserBaseInfoView{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userCard='" + userCard + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", userAddrDetail='" + userAddrDetail + '\'' +
                ", userCode='" + userCode + '\'' +
                '}';
    }
}
