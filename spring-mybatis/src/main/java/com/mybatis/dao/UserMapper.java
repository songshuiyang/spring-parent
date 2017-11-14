package com.mybatis.dao;


import com.mybatis.demain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Repository
public interface UserMapper {
    List<User> queryAll();

    List<User> findPageList(Map<String, Object> map);
}