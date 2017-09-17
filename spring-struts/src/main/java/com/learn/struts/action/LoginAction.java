package com.learn.struts.action;

import com.learn.struts.demain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/9/16 20:41
 */
@Component
public class LoginAction extends ActionSupport { // ActionSupport 默认的Action处理类
    // 提供实例变量来封装Http请求参数
    private String userName;

    private String passWord;
    // 封装服务器提示的tip实例变量（封装处理结果）
    private String tip;

    public User user;

    // 系统是通过对应的getter setter方法来处理请求参数的，而不是通过实例变量名来处理请求参数
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    // 定义处理用户请求的execute方法
    @Override
    public String execute() throws Exception {
        if (passWord.equals("123456")) {
            ActionContext.getContext().getSession().put("user", userName);
            tip = "tip messages";
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    // 使用Action的动态方法调用
    public String regist() throws Exception {
        System.out.println("执行注册方法");
        return SUCCESS;
    }
}
