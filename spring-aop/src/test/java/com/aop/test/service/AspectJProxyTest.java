package com.aop.test.service;

import com.aop.learn.aspectj.PreGreetingAspect;
import com.aop.learn.service.Writer;
import com.aop.learn.service.impl.NativeWaiter;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author songshuiyang
 * @title: 使用 AspectJProxyFactory植入基于@AspectJ的切面
 * @description:
 * @date 2017/11/15 21:23
 */
public class AspectJProxyTest {

    @Test
    public void proxy() {
        Writer writer = new NativeWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(writer);
        factory.addAspect(PreGreetingAspect.class);
        Writer proxy = factory.getProxy();
        proxy.greetTo("songshuiyang");
        proxy.serveTo("songshuiyang");
    }
}
