package com.ethan.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 13:49
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public Object test(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().setAttribute("123","1234");
        return "test";
    }

    @RequestMapping("menu/info")
    public Object test1(HttpServletRequest httpServletRequest){
        return new Date();
    }

    @RequestMapping("user/info")
    public Object test3(HttpServletRequest httpServletRequest){
        System.out.println("user/info controller方法");
        return new Date();
    }
}
