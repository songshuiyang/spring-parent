package com.tx.service;

import com.tx.BaseTest;
import com.tx.service2.UserService1;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title: 基于注解的事务控制
 * @description:
 * @date 2017/8/25 0:11
 */
public class TestDemo5 extends BaseTest {
    @Resource
    private UserService1 userService;

    @Test
    public void test() throws Exception {
        userService.transfer("aaa", "bbb", 200d);
    }
}