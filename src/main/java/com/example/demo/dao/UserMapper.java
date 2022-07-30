package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
     List findAllUser();
     void addUser(User user);
     void updateUser(User user);
     boolean deleteUser(@Param("studentNo") String studentNo);
     User findOne(@Param("studentNo")String studentNo,@Param("studentName") String studentName);
}
