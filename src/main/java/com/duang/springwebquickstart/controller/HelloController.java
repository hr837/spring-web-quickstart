package com.duang.springwebquickstart.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello world!");
        return  "Hello World!";
    }

    @GetMapping("/search")
    public  String search(@RequestParam(name = "n") String name){
        return  name;
    }

    @GetMapping("/dateParam")
    public  String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return  updateTime.toString();
    }
}
