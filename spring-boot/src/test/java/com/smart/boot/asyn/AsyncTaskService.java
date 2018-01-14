package com.smart.boot.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title: 异步任务
 * @description:
 * @date 2018/1/14 21:41
 */
@Service
public class AsyncTaskService {
    /**
     * 异步方法
     *
     * @param i
     */
    @Async
    public void task1(Integer i) {
        System.out.println("执行异步任务" + i);
    }

    @Async
    public void task2(Integer i) {
        System.out.println("执行异步任务+1 " + (i + 1));
    }
}
