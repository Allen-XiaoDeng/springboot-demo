package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class CRUDTest {
    private static final Logger logger = LoggerFactory.getLogger(CRUDTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void SelectTest() {
//        System.out.println(userService.findAllUser());
//        System.out.println(userService.findAllUser());
        logger.info(userService.findAllUser().toString());
    }

    @Test
    public void InsertTest() {
        Map map = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };
        map.put("studentName", "李松在");
        map.put("studentAge", 19);
        map.put("studentGender", "男");
//        userService.addUser(map);
    }

}