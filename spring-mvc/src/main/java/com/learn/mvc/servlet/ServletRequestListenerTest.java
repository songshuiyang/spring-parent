package com.learn.mvc.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author songshuiyang
 * @title: 监听用户到达的请求
 * @description:
 * @date 2017/9/15 15:47
 */
/*@WebListener*/
public class ServletRequestListenerTest implements ServletRequestListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void requestInitialized(ServletRequestEvent sre) {
        logger.debug("监听Request请求到达,被初始化时触发。。。。。。。。。。。。。");
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        logger.debug("监听Request请求结束,被初始化时触发。。。。。。。。。。。。。");
    }

}
