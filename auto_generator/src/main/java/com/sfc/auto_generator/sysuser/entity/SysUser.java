package com.sfc.auto_generator.sysuser.entity;

import com.sfc.auto_generator.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author sufuchuan
 * @since 2019-09-15
 */
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userName;

    private String userDesc;

    private String userPwd;

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
    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public static final String USER_ID = "user_id";

    public static final String USER_NAME = "user_name";

    public static final String USER_DESC = "user_desc";

    public static final String USER_PWD = "user_pwd";

    @Override
    public String toString() {
        return "SysUser{" +
            "userId=" + userId +
            ", userName=" + userName +
            ", userDesc=" + userDesc +
            ", userPwd=" + userPwd +
        "}";
    }
}
