package com.learn.mvc.controller;

import com.learn.mvc.demain.User;
import com.learn.mvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    /**
     * 测试PathVariable注解
     * @param id
     */
    @RequestMapping("regist/{id}")
    @ResponseBody
    public Map<String,Object> registPathVariable(@PathVariable String id){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","songshuiyang");
        map.put("id",id);
        logger.debug("------------{}",id);
        return map;
    }

    /**
     * 测试参数绑定
     * @param sessionId
     * @param encoding
     * @param cookie
     */
    @RequestMapping("header")
    public void cookieValue(@CookieValue(value="sessionId",required=false) String sessionId,
                            @RequestHeader("Accept-Encoding") String encoding,
                            @RequestHeader("Cookie") String cookie){
        logger.info("sessionId{}",sessionId);
        logger.info("encoding{}",encoding);
        logger.info("keepAlive{}",cookie);
    }

    /**
     * 整合freemaker
     * @return
     */
    @RequestMapping("freemaker")
    public ModelAndView freemaker() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("freemaker");
        modelAndView.addObject("name", userService.createUser().getUserName());
        return modelAndView;
    }


}