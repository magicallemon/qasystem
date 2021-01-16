package com.springboot.qa.qasystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//首页控制器
@Controller
public class IndexController {

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("xixihhh-----------------------");
        return "hello";
    }
}
