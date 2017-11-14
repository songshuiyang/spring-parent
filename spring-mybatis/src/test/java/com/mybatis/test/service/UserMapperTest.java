package com.mybatis.test.service;

import com.mybatis.dao.UserMapper;
import com.mybatis.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/11/14 20:25
 */
public class UserMapperTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test1() {
        userMapper.queryAll();
    }

    @Test
    public void test2() {
        logger.info("------------------------------------------------------------------");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> idList = new ArrayList<Integer>();
        idList.add(1);
        idList.add(4);
        idList.add(5);
        map.put("IN_id", idList);
        userMapper.findPageList(map);
    }

}
