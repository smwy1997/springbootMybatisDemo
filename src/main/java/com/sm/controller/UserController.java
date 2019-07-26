package com.sm.controller;

import com.sm.domain.User;
import com.sm.mapper.UserMapper;
import com.sm.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @RequestMapping("/")
    public String hello(){

        return "Hello SpringBoot~~~";
    }

    @RequestMapping("/getUserInfo")
    public User userInfo(String username) {
        return userService.selectUserByUsername(username);
    }
}
