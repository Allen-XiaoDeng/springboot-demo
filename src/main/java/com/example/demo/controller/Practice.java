package com.example.demo.controller;

import com.example.demo.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class Practice {
    @Autowired
    private PracticeService practiceService;
    //get请求
    @GetMapping("/get")
    public Integer getId(Integer id){
        return id*100;
    }
    //post请求
    @PostMapping("/post")
    public String postUser(@RequestBody Map<String,Object> map){
        return practiceService.info_splice(map);
    }
    //put请求
    @PutMapping("/put")
    public Object put(@RequestBody Map<String,Object>map){
        return practiceService.info_judge(map);
    }
    //delete请求
    @DeleteMapping("/delete")
    public String delete(@RequestBody Map<String,Object>map){
        return practiceService.info_delete(map);
    }
}
//@Controller
//@ResponseBody
//public class test01 {
//    @RequestMapping("/test")
//    public String index(){
//        return "hello JAVA2";
//    }
//}
