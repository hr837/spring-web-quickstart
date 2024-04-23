package com.duang.springwebquickstart.controller;

import com.duang.springwebquickstart.pojo.Address;
import com.duang.springwebquickstart.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String createUser(User user) {
        return user.toString();
    }

    @GetMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @GetMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }


    @GetMapping("/{id}")
    public String getUser(@PathVariable String id){
        return  "用户ID是：" + id;
    }

    @GetMapping("/{id}/{key}")
    public String getUserAndKey(@PathVariable String id,@PathVariable(name = "key") String keyName){
        return  "用户ID是：" + id + ",Key 是：" + keyName;
    }

    @PostMapping("/jsonCreate")
    public String jsonCreate(@RequestBody User user){
        System.out.println(user);
        return  user.toString();
    }

    @GetMapping("/info")
    public User getUser(){
        User u =  new User();
        u.setName("Duang");
        u.setAge(34);
        Address a = new Address();
        a.setName("金科");
        a.setCity("西咸");
        u.setAddr(a);
        return  u;
    }
}
