package com.mybatis.service.impl;


import com.mybatis.dao.UserMapper;
import com.mybatis.demain.User;
import com.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
