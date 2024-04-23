package com.duang.springwebquickstart.service.impl;


import com.duang.springwebquickstart.dao.EmployeeDao;
import com.duang.springwebquickstart.pojo.Address;
import com.duang.springwebquickstart.pojo.User;
import com.duang.springwebquickstart.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<User> getList() {
        List<User> users = employeeDao.listUser();
        users.forEach(item ->{
            item.setName("姓名" + item.getName());
            item.setAge(32 + item.getAge());
            Address addr = item.getAddr();
            addr.setCity("陕西省"+ addr.getCity());
            addr.setName(addr.getCity() + addr.getName());
            item.setAddr(addr);
        });
        return  users;
    }
}
