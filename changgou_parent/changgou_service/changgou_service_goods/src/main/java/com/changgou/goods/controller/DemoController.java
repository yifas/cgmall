package com.changgou.goods.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class DemoController {


    @GetMapping("/hello")
    public String hello(){
        return "Hello";

    }
}
