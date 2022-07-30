package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.PageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@Controller
public class PageController {

    @Autowired
    private PageService pageService;

    private Logger logger = LoggerFactory.getLogger(PageController.class);

    //获取学生信息
    @RequestMapping("/all")
    public String findAll(Model model){
        model.addAttribute("title","学生的信息");
        List list = pageService.findAll();
        model.addAttribute("user",list);
        return "student";
    }
    //根据studentNo获取学生信息
    @RequestMapping("/find-one")
    public String findByNo(@RequestParam("studentNo") String studentNo , Model model){
        model.addAttribute("user",pageService.findByNo(studentNo));
        return "student";
    }
    //添加数据
    @RequestMapping("/add")
    public String addInfo(String studentNo ,String studentName,Integer studentAge,String studentGender , Model model){
        pageService.addStudent(studentNo,studentName,studentAge,studentGender );
        model.addAttribute("user",pageService.findAll());
        return "student";

    }
    //修改信息
    @RequestMapping("/update")
    public String updateInfo(String studentNo ,String studentName,int studentAge,String studentGender , Model model){
        //学生id:studentNo 学生姓名:studentName 学生年龄:studentAge 学生性别:studentGender
        pageService.updateInfo(studentNo,studentName,studentAge,studentGender);
        model.addAttribute("user",pageService.findAll());
        return "student";
    }
    //根据studentNo删除学生信息
    @RequestMapping(value = "/delete")
    public String  deleteStudent(@PathParam("studentNo") String studentNo,Model model){
        pageService.deleteStudent(studentNo);
        model.addAttribute("user",pageService.findAll());
        return "student";
    }

    @RequestMapping("/students")
    public String student(){
        return "student";
    }
    @RequestMapping("/info")
    public String info(Model model){
        model.addAttribute("title","学生信息");
        User user = new User();
        user.setStudentNo("s018");
        user.setStudentName("李五");
        user.setStudentAge(19);
        user.setStudentGender("男");
        model.addAttribute("user",user);
        return "student";
    }
}
