package com.mybatis.dao;


import com.mybatis.demain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface UserMapper {
    List<User> queryAll();

    List<User> findPageList(User user);
}