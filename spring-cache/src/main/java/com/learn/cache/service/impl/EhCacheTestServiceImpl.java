package com.learn.cache.service.impl;

import com.learn.cache.service.EhCacheTestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/24 20:52
 */
@Service
public class EhCacheTestServiceImpl implements EhCacheTestService {

    @Cacheable(value = "cacheTest", key = "#param")
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }
}
