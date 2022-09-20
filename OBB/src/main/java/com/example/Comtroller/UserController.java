package com.example.Comtroller;

import com.example.UserMata.AlibabapersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@Autowired
AlibabapersonMapper alibabapersonMapper;



    @GetMapping("/dq")
    public void get(){
    alibabapersonMapper.selectCount(null);
    }

}
