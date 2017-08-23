package com.learn.mvc.controller;

import com.learn.mvc.demain.User;
import com.learn.mvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserService userService;

    /**
     *
     * @return
     */
    @RequestMapping("hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("name", userService.createUser().getUserName());
        modelAndView.addObject("password", userService.createUser().getPassWord());
        modelAndView.addObject("realName", userService.createUser().getRealName());
        return modelAndView;
    }

    @RequestMapping("regist")
    public String register(@ModelAttribute("user") User user){
        logger.debug("-----------{}"+user.toString());
        return "hello";
    }


}