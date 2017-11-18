package com.aop.learn.service.impl;

import com.aop.learn.service.AgentWriter;
import com.aop.learn.service.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/18 12:59
 */
@Component
public class AgentWriterImpl implements AgentWriter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void agent(Writer writer) {
        logger.info("--------------执行AgentWriterImpl方法-------------");
        logger.info(writer.getClass().getName());
    }
}
