package com.smart.boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2018/1/14 23:11
 */
@Controller
public class HelloController {
    @RequestMapping("index")
    public String hello() {
        return "index";
    }
}
