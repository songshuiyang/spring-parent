package com.aop.learn.aspectj;

import com.aop.learn.service.Seller;
import com.aop.learn.service.impl.SmartSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title: 引介增强
 * @description:
 * @date 2017/11/15 22:36
 */
@Aspect
@Component
public class EnableSellerAspect {
    @DeclareParents(value = "com.aop.learn.service.impl.NativeWaiter", defaultImpl = SmartSeller.class)
    public Seller seller;

}
