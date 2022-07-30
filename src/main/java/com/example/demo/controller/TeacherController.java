package com.example.demo.controller;

import com.example.demo.service.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @GetMapping("/one-many")
    public List oneToMany(){
        return teacherService.oneToMany();
    }
    @GetMapping("/all")
    public List all(){
        return teacherService.all();
    }
    @GetMapping("/one-one")
    public List oneToOne(){
        return teacherService.oneToOne();
    }
}
