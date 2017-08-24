package com.learn.cache.service;

import com.learn.cache.demain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 18:44
 */
@Service
public class UserServiceImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Cacheable("users")
    public User getUserById(String userId){
        logger.debug("真实查询 user");
        return new User("1","songshuiyang",3);
    }
}
