package com.tx.service;

import com.tx.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title: 测试编程式事务控制
 * @description:
 * @date 2017/8/24 23:15
 */
public class TestDemo2 extends BaseTest {

    @Resource
    @Qualifier("accountService2Impl")
    private AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("aaa", "bbb", 200d);
    }
}
