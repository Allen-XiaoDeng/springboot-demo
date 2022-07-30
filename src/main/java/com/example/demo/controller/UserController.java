package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    // 查询表中的所有数据
    @GetMapping("/find-all")
    public List findAll(){
        return  userService.findAllUser();
    }
    //根据名字查询数据
    @GetMapping("/find-one")
    public User findOne(@RequestParam String studentNo,@RequestParam String studentName){
        return userService.findOne(studentNo,studentName);
    }
    //添加数据
    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    //修改数据
    @PutMapping("/update-user")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
    //删除数据
    @DeleteMapping("/delete-user")
    public boolean deleteUser(@RequestParam(required = true) String studentNo){
      return  userService.deleteUser(studentNo);
    }

}
