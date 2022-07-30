package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List findAllUser() {
//        System.out.println(2);
        if(!userMapper.findAllUser().isEmpty()){
            return userMapper.findAllUser();
        }
        else {
            return null;
        }
    }

    @Override
    public void addUser(User user) {
        if (user!=null){
            userMapper.addUser(user);
        }
    }

    @Override
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @Override
    public boolean deleteUser(String studentNo) {
        System.out.println(studentNo);
     return  userMapper.deleteUser(studentNo);
    }

    @Override
    public User findOne(String studentNo,String studentName) {
//        System.out.println(studentName);
        return userMapper.findOne(studentNo,studentName);
    }



}
