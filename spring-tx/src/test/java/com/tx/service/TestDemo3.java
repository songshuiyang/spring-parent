package com.tx.service;

import com.tx.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title: 基于TransactionProxyFactoryBean的方式
 * @description:
 * @date 2017/8/24 23:30
 */
public class TestDemo3 extends BaseTest {

    @Resource
    @Qualifier("accountServiceProxy")
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
