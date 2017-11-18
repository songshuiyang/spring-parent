package com.quartz.learn.trigger;

import com.quartz.learn.job.SimpleJob;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author songshuiyang
 * @title: 使用SimpleTrigger进行调度
 * @description:
 * @date 2017/11/18 22:25
 */
public class SimpleTriggerRunner {

    public static void main(String[] args) throws Exception {
        JobDetail jobDetail = new JobDetail("job_4", "jgroup4", SimpleJob.class);

        SimpleTrigger simpleTrigger = new SimpleTrigger("trigger_4", "tgroup4");
        simpleTrigger.setStartTime(new Date()); // 开始时间
        simpleTrigger.setRepeatInterval(2000);  // 间隔
        simpleTrigger.setRepeatCount(100);      // 次数

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();

        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, simpleTrigger);
        scheduler.start();
    }
}
