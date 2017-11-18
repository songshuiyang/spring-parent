package com.aop.learn.aspectj;

import com.aop.learn.service.AgentWriter;
import com.aop.learn.service.Writer;
import com.aop.learn.service.impl.NativeWaiter;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 绑定代理对象
 * @description:
 * @date 2017/11/18 12:52
 */
@Aspect
@Component
public class AgentAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("this(agentWriter)")
    public void bindProxyObj(AgentWriter agentWriter) {
        logger.info("------------------绑定代理对象------------------");
        Writer writer = new NativeWaiter();
        writer.greetTo("执行代理对象的值");
        logger.info(agentWriter.getClass().getName());
        logger.info("------------------绑定代理对象------------------");
    }
}
