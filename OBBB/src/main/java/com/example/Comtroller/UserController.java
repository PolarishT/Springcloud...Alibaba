package com.example.Comtroller;

import com.example.Openfeign.OpenfeignOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
@Resource
  private   OpenfeignOne openfeignOne;

@GetMapping("/findall")
    public String findall(){
    System.out.println("我是消费者 拉取服务者");
    String s = openfeignOne.find();
    return s;
}
}
