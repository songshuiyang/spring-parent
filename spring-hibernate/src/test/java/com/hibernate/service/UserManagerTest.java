package com.hibernate.service;

import com.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * @author songshuiyang
 * @title: 没有使用Spring进行测试Hibernate
 * @description:
 * @date 2017/9/24 0:07
 */
public class UserManagerTest {
    @Test
    public void test1() {
        // 实例化Configuration，
        Configuration conf = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).configure().build();
        // 以Configuration实例创建SessionFactory实例
        SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
        // 创建Session
        Session sess = sf.openSession();
        // 开始事务
        Transaction tx = sess.beginTransaction();
        // 创建消息对象
        User user = new User();
        // 设置消息标题和消息内容
        user.setName("hibernate");
        user.setSex(12);
        sess.save(user);
        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
    }
}
