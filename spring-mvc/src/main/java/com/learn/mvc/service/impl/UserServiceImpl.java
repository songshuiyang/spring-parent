package com.learn.mvc.service.impl;

import com.learn.mvc.demain.User;
import com.learn.mvc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/23 21:56
 */
@Service
public class UserServiceImpl implements UserService {

    public User createUser() {
        User user = new User();
        user.setUserName("songshuiyang");
        user.setPassWord("123456");
        user.setRealName("宋水阳");
        return user;
    }


}
