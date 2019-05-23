package com.zwr.teststarter.controller;



import com.zwr.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHello("你好");
    }
}
