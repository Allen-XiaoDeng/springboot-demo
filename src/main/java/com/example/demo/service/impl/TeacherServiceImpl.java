package com.example.demo.service.impl;

import com.example.demo.dao.TeacherMapper;
import com.example.demo.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public List oneToMany() {
        return teacherMapper.oneToMany();
    }

    @Override
    public List all() {
        return teacherMapper.all();
    }

    @Override
    public List oneToOne() {
        return teacherMapper.oneToOne();
    }
}
