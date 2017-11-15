package com.aop.learn.service.impl;

import com.aop.learn.service.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/15 21:07
 */
@Service
public class NativeWaiter implements Writer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void greetTo(String clientName) {
        logger.info("-------------greetTo " + clientName);
    }

    @Override
    public void serveTo(String clientName) {
        logger.info("-------------serveTo " + clientName);
    }
}
