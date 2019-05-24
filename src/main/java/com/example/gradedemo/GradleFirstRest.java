package com.example.gradedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleFirstRest {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Just say hello");
        return "hello intelli J";
    }

    @RequestMapping("/")
    public String indexMethod(){
        System.out.println("This is index method");
        return "IntelliJ is cool";
    }
}
