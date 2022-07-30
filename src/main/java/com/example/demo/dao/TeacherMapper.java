package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List oneToMany();
    List all();
    List oneToOne();
}
