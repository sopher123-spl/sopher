package com.itjbit.controller;

import com.itjbit.domain.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping("/hehe")
    public @ResponseBody Address hello(@RequestBody Address address){
        System.out.println(address.getAddressName());
        address.setAddressName("haha");
        return address;
    }

    @RequestMapping("/index")
    public String index(){
        return "success";
    }
}
