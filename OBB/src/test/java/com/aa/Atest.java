package com.aa;

import com.example.UserMata.Alibabaperson;
import com.example.UserMata.AlibabapersonMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Atest {
    @Autowired
    AlibabapersonMapper alibabapersonMapper;
    @Test
  public  void reffhjjg(){
        Alibabaperson alibabaperson = new Alibabaperson();
        alibabaperson.setName("dd");
        alibabaperson.setPhone("18080266036");
        alibabapersonMapper.insert(alibabaperson);
        System.out.println("dd");
    }
}
