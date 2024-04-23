package com.duang.springwebquickstart.dao.impl;

import com.duang.springwebquickstart.dao.EmployeeDao;
import com.duang.springwebquickstart.pojo.Address;
import com.duang.springwebquickstart.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public List<User> listUser() {
      ArrayList<User> users = new ArrayList<User>();
      for (int i = 0; i < 8; i++) {
          String indexStr = String.valueOf(i);
          User u = new User();
          u.setName(indexStr);
          u.setAge(i);
          Address addr = new Address();
          addr.setCity("西咸新区");
          addr.setName("金科");
          u.setAddr(addr);
          users.add(u);
      }
      return  users;
  }
}
