package com.aop.learn.service.impl;

import com.aop.learn.service.Seller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/15 22:35
 */
@Service
public class SmartSeller implements Seller {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void sell(String good) {
        logger.info("-------------sellTo " + good);
    }
}
