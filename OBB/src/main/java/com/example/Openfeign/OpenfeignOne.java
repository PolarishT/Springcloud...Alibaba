package com.example.Openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "Service.ALIBABA.TRB")
public interface OpenfeignOne {
    @RequestMapping("/server/v1/find")
    public String find();




}
