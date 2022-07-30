package com.example.demo.service.impl;

import com.example.demo.service.PracticeService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PracticeServiceImpl implements PracticeService {

//    传入{name:”张三”,sex:“男”,age: “18”}，后端返回“张三，男，18”
    @Override
    public String info_splice(Map map) {
        return ("name:"+map.get("name")+","+"sex:"+map.get("sex")+","+"age:"+map.get("age"));
    }
//    传入{name:”张三”,sex:“男”,age: “18”},返回{name:"张三",sex:"男",age: "18"，mark:"已成年"}
    @Override
    public Map info_judge(Map map) {
        if((Integer)map.get("age")>=18){
            map.put("mark","已成年");
        }
        else{
            map.put("mark","未成年");
        }
        return map;
    }
//    传入{name:”张三”,sex:“男”,age: “18”},返回张三信息已删除
    @Override
    public String info_delete(Map map) {
        if(!map.isEmpty()){
            return (map.get("name")+"信息已删除");
        }
        else {
            return "信息传入为空";
        }
    }
}
