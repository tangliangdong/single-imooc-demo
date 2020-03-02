package com.imooc.controller;

import com.imooc.service.StuService;
import com.imooc.service.TestTransServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TestTransServiceImpl testTransService;

    @GetMapping("hello")
    public Object hello(){
        return "Hello World~";
    }

    @GetMapping("test")
    public void test(){
        testTransService.testPropagationTrans();
    }
}
