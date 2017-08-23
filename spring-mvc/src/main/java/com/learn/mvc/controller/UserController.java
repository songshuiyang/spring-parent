package com.learn.mvc.controller;

import com.learn.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author songshuiyang
 * @title:
 * @description:
 * @date 2017/8/23 21:39
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("hello")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("name",userService.createUser().getUserName());
        modelAndView.addObject("password",userService.createUser().getPassword());
        modelAndView.addObject("realName",userService.createUser().getRealName());
        return modelAndView;
    }
}
