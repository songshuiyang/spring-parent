package com.mybatis.test.service;

import com.mybatis.dao.UserMapper;
import com.mybatis.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/14 20:25
 */
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test1() {
        userMapper.queryAll();
    }

}
