package com.learn.cache.service;

import com.learn.cache.utils.CacheManager;
import com.learn.cache.demain.User;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 18:25
 */
public class UserService {

    CacheManager<User> cacheManager = new CacheManager<User>();

    // 模拟缓存使用
    public User getUserById(String userId){
        User user = cacheManager.getValue(userId);
        if(user != null){
            return user;
        }else{
            user = new User("1","songshuiyang",3); // 模拟从数据库里查询
            cacheManager.addOrUpdateCache(userId,user);
        }
        return user;
    }
}
