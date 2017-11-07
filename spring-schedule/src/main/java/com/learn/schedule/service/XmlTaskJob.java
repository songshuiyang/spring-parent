package com.learn.schedule.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @author songshuiyang
 * @title: 基于xml文件配置的定时任务
 * @description:
 * @date 2017/11/7 22:20
 */
@Service
public class XmlTaskJob {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void job1() {
        logger.info("基于xml文件配置的定时任务，每隔一秒执行");
    }

}
