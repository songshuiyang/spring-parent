package com.learn.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/9/17 23:58
 */
@Component
public class SimpleViewResultAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return ERROR;
    }
}
