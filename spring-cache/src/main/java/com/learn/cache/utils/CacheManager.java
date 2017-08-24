package com.learn.cache.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author songshuiyang
 * @title: 缓存管理器
 * @description:
 * @date 2017/8/24 18:20
 */
public class CacheManager<T> {
    private Map<String,T> cache = new ConcurrentHashMap<String, T>();

    public T getValue(String key){
        return cache.get(key);
    }
    public void addOrUpdateCache(String key,T value){
        cache.put(key,value);
    }
    public void deleteCache(String key){
        if(cache.containsKey(key)){
            cache.remove(key);
        }
    }
    public void clearCache(){
        cache.clear();
    }
}
