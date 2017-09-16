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
public class LoginAction extends ActionSupport {

    private String userName;

    private String passWord;

    public User user;

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

    // 定义处理用户请求的execute方法
    @Override
    public String execute() throws Exception {
        if (passWord.equals("123456")) {
            ActionContext.getContext().getSession().put("user", userName);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
