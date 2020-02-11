package com.luxu.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxu.ssm.pojo.User;
import com.luxu.ssm.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    UserService userService;
    
    @Autowired
    HttpServletRequest request;
    
    @RequestMapping(value = "user")
    public List<User> selectUser() {
        
        String username = "lx";
        List<User> users = userService.selectUserByUsername(username);
        return users;
    }
}
