package com.hibernate.service;

import com.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songshuiyang
 * @title: 没有使用Spring进行测试Hibernate
 * @description:
 * @date 2017/9/24 0:07
 */
public class UserManagerTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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


        // 新增操作
        User user = new User();
        // 设置消息标题和消息内容
        user.setName("hibernate");
        user.setSex(12);
        Object o = sess.save(user);
        logger.info("返回该持久化对象的唯一标识: " + o);

        // 查询操作
        User user1 = sess.load(User.class, 4);// get方法也用于根据主键加载持久化实例,但get方法会立刻访问数据库
        logger.info("根据主键加载持久化实体:" + user1.toString());

        // 更新操作
        user1.setName("更改后的文件");
        sess.flush();

        // 删除操作
        User user2 = sess.load(User.class, 5);
        sess.delete(user2);


        // 提交事务
        tx.commit();
        // 关闭Session
        sess.close();
        sf.close();
    }
}
