package com.duang.springwebquickstart.dao;

import com.duang.springwebquickstart.pojo.User;

import java.util.List;

public interface EmployeeDao {
  public List<User> listUser();
}
