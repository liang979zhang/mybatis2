package com.zdl.mybatis2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginConller {


    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            return "dashboard";
        } else {
            return "login";
        }
    }


}
