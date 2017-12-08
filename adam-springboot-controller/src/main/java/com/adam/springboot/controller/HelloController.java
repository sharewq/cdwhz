package com.adam.springboot.controller;

import com.adam.springboot.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Think on 2017/12/4.
 */

@Controller
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        helloService.helloWorld();
        return "Hello ,spring boot!";
    }
}
