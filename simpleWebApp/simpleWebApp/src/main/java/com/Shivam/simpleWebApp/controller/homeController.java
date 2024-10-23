package com.Shivam.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to home page : " ;
    }

    @RequestMapping("/about")
    public String about() {
        return "Hope you are doing Good : ";
    }
}
