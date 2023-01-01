package com.spring.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerClass {
    @Autowired
    POJO pojo;

    @GetMapping("/hello")
    public String home() {

        return "Home page";
    }


    @GetMapping("/greeting")
    public POJO getMethod(@RequestParam(value = "name") String name){
        System.out.println("hello");
        pojo.setName(name);
        pojo.setGreeting("Hello " + name);
        return pojo;
    }

}
