package com.learn.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/7 22:20
 */
@Service
public class TaskJob {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void job1() {
        System.out.println("任务进行中。。。");
        logger.info("任务进行中。。。");
    }

}
