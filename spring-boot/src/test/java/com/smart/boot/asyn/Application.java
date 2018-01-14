package com.smart.boot.asyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author songshuiyang
 * @title: 并发任务不是顺序执行的
 * @description:
 * @date 2018/1/14 21:44
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.task1(i);
            asyncTaskService.task2(i);
        }
        context.close();
    }
}
