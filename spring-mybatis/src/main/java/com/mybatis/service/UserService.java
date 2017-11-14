package com.mybatis.service;


import com.mybatis.demain.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

//    Page<User> findPageList(int pageNum, int pageSize, User user);

}
