package com.smart.boot.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2018/1/14 15:22
 */
@Service("eLService")
public class ELService {

    public String another;

    public String getAnother() {
        return another;
    }

    @Autowired
    public void setAnother() {
        this.another = "ELService 自动注入";
    }
}
