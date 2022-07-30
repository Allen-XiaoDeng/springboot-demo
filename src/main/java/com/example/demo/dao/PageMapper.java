package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PageMapper {
    List findAll();
    boolean deleteStudent(String studentNo);
    boolean addStudent(User user);
    User findByNo(String studentNo);
    boolean updateInfo(User user);
}
