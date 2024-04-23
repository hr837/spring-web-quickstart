package com.duang.springwebquickstart.controller;

import com.duang.springwebquickstart.pojo.Address;
import com.duang.springwebquickstart.pojo.Result;
import com.duang.springwebquickstart.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ResultTestController {

    @GetMapping("/getAny")
    public Result getAny(){
        return  Result.success("Some data for you");
    }

    @GetMapping("/getObj")
    public Result getObj(){
        User u =  new User();
        u.setName("Duang");
        u.setAge(34);
        Address a = new Address();
        a.setName("金科");
        a.setCity("西咸");
        u.setAddr(a);
        return  Result.success(u);
    }


    @GetMapping("/getError")
    public Result getError(){
        return  Result.error("发生了一些错误",999);
    }
}
