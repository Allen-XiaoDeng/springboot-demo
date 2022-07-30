package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;


public interface UserService {
    List findAllUser();

    void addUser(User user);

    void updateUser(User user);

    boolean deleteUser(String studentNo);

    User findOne(String studentNo,String studentName);

}
