package com.tx.service;

import com.tx.BaseTest;
import com.tx.service1.UserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title: 基于AspectJ的XML方式
 * @description:
 * @date 2017/8/24 23:59
 */
public class TestDemo4 extends BaseTest {
    @Resource
    private UserService userService;

    @Test
    public void test() throws Exception {
        userService.updateBalance("aaa", "bbb", 200d);
    }
}
