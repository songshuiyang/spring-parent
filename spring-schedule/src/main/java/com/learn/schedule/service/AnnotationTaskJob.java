package com.learn.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 基于注解配置的定时任务
 * @description:
 * @date 2017/11/7 22:42
 */
@Component
public class AnnotationTaskJob {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "*/2 * * * * ?") //每2秒执行一次
    public void job() {
        logger.info("基于注解配置的定时任务，每隔俩秒执行");
    }
}
