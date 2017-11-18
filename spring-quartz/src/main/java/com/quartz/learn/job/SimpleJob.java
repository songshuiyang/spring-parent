package com.quartz.learn.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author songshuiyang
 * @title: Job实现类
 * @description:
 * @date 2017/11/18 22:20
 */
public class SimpleJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("正执行任务" + context.getTrigger().getName() + "触发时间为" + new Date());
    }
}
