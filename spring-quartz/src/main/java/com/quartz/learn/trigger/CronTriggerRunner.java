package com.quartz.learn.trigger;

import com.quartz.learn.job.SimpleJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


/**
 * @author songshuiyang
 * @title: 使用CronTriggerRunner进行调度
 * @description:
 * @date 2017/11/18 22:34
 */
public class CronTriggerRunner {

    public static void main(String[] args) throws Exception {
        JobDetail jobDetail = new JobDetail("job_3", "jgroup3", SimpleJob.class);

        CronTrigger cronTrigger = new CronTrigger("trigger_3", "tgroup3");
        CronExpression cronExpression = new CronExpression("0/1 * * * * ?");
        cronTrigger.setCronExpression(cronExpression);

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();

        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, cronTrigger);
        scheduler.start();
    }

}
