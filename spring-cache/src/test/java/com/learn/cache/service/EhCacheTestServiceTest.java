package com.learn.cache.service;

import com.learn.cache.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 21:00
 */
public class EhCacheTestServiceTest extends BaseTest {

    @Autowired
    private EhCacheTestService ehCacheTestService;

    @Test
    public void getTimestampTest() throws InterruptedException {
        System.out.println("第一次调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(2000);
        System.out.println("2秒之后调用：" + ehCacheTestService.getTimestamp("param"));
        Thread.sleep(11000);
        System.out.println("再过11秒之后调用：" + ehCacheTestService.getTimestamp("param"));
    }
}
