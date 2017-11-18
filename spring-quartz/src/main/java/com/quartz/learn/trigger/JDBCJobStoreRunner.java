package com.quartz.learn.trigger;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author songshuiyang
 * @title: 从数据库中恢复任务的调度
 * @description:
 * @date 2017/11/18 23:06
 */
public class JDBCJobStoreRunner {

    public static void main(String args[]) {
        try {
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            // 获取调度器所有的触发器组
            String[] triggerGroups = scheduler.getTriggerGroupNames();

            // 重新恢复tgroup1组中名为trigger1_1的触发器的执行
            for (int i = 0; i < triggerGroups.length; i++) {
                String[] triggers = scheduler.getTriggerNames(triggerGroups[i]);
                for (int j = 0; j < triggers.length; j++) {
                    Trigger tg = scheduler.getTrigger(triggers[j],
                            triggerGroups[i]);
                    if (tg instanceof SimpleTrigger
                            && tg.getFullName().equals("jgroup4.trigger_4")) {
//						((SimpleTrigger) tg).setRepeatCount(100);
                        scheduler.rescheduleJob(triggers[j], triggerGroups[i], tg);
                    }
                }
            }
            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
