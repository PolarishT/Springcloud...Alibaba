package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/find")
    public String find(){
        System.out.println("我是消费者 拉取服务者");
        return "我是消费者 拉取服务者";
    }
}






