package com.learn.mvc.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author songshuiyang
 * @title: 监听Web容器
 * @description:
 * @date 2017/9/15 15:36
 */
public class ContainerServletTest implements ServletContextListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void contextInitialized(ServletContextEvent sce) {
        logger.debug("监听Web容器的启动。。。。。。。。。。。。。");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        logger.debug("监听Web容器的关闭。。。。。。。。。。。。。");
    }
}
