package com.Shivam.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

   @RequestMapping("/login")
    public String login(){
        return " login page !!! " ;
    }
}
