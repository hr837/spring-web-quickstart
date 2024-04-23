package com.duang.springwebquickstart.controller;


import com.duang.springwebquickstart.pojo.Address;
import com.duang.springwebquickstart.pojo.Result;
import com.duang.springwebquickstart.pojo.User;
import com.duang.springwebquickstart.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/list")
    public Result getList() {
        return Result.success(employeeService.getList());
    }

//    @GetMapping("/list")
//    public Result getList() {
//        ArrayList<User> users = new ArrayList<User>();
//        for (int i = 0; i < 8; i++) {
//            User u = new User();
//            u.setName("用户"+ i);
//            u.setAge(10 + i);
//            Address addr = new Address();
//            addr.setCity("城市"+ i);
//            addr.setName("住址"+ i);
//            u.setAddr(addr);
//            users.add(u);
//        }
//        return Result.success(users);
//    }
}
