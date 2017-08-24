package com.tx.service;

import com.tx.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title: 测试联通性
 * @description:
 * @date 2017/8/24 22:29
 */
public class TestDemo1 extends BaseTest {

    @Resource
    @Qualifier("accountServiceImpl1")
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
