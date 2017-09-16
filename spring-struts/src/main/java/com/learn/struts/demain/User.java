package com.learn.struts.demain;

import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/23 21:57
 */
@Component
public class User {
    private String userName;
    private String passWord;
    private String realName;

    public User() {
        userName = "songshuiyang";
        passWord = "6954321";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
