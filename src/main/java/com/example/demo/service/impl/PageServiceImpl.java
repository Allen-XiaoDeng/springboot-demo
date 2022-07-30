package com.example.demo.service.impl;

import com.example.demo.dao.PageMapper;
import com.example.demo.entity.User;
import com.example.demo.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PageServiceImpl implements PageService {
    @Resource
    private PageMapper pageMapper;
    @Override
    public List findAll() {
        return pageMapper.findAll();
    }

    @Override
    public boolean deleteStudent(String studentNo) {
//        boolean p =  pageMapper.deleteStudent(studentNo);
        if(pageMapper.findByNo(studentNo)==null){
            return false;
        }
        return pageMapper.deleteStudent(studentNo);
    }

    @Override
    public boolean addStudent(String studentNo ,String studentName,Integer studentAge,String studentGender ) {

        User user = new User();
        user.setStudentNo(studentNo);
        //判断传入的学生编号是否为空
        if(pageMapper.findByNo(studentNo)==null){
            return false;
        }
        user.setStudentName(studentName);
        user.setStudentAge(studentAge);
        user.setStudentGender(studentGender);
        return pageMapper.addStudent(user);
    }

    @Override
    public User findByNo(String studentNo) {
        if(studentNo==null||studentNo.length()==0){
            return null;
        }
        return pageMapper.findByNo(studentNo);
    }

    @Override
    public boolean updateInfo(String studentNo ,String studentName,int studentAge,String studentGender ) {
        User user = new User();
        if(studentNo==null||
           studentNo.length()==0||
           studentName.length()==0||
           studentName==null){
            return false;
        }
        user.setStudentNo(studentNo);
        user.setStudentName(studentName);
        user.setStudentAge(studentAge);
        user.setStudentGender(studentGender);
        return pageMapper.updateInfo(user);

    }


}
