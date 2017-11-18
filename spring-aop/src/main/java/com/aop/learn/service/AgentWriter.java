package com.aop.learn.service;


import com.aop.learn.annotation.Author;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/18 12:58
 */
public interface AgentWriter {

    @Author(name = "songshuiyang")
    void agent(Writer writer);

}
