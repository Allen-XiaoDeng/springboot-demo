package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface PageService {
    List findAll();
    boolean deleteStudent(String studentNo);
    boolean addStudent(String studentNo ,String studentName,Integer studentAge,String studentGender);
    User findByNo(String studentNo);
    boolean updateInfo(String studentNo ,String studentName,int studentAge,String studentGender );
}
