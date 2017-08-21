package com.learn.ioc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/21 14:48
 */
@Component
public class DateUtils {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    private void init1(){
        logger.debug("Bean生命过程方法、PostConstruct");
    }

    @PreDestroy
    private void destory(){
        logger.debug("Bean生命过程方法、destory");
    }


}
