package com.luxu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luxu.ssm.dao.UserDao;
import com.luxu.ssm.pojo.User;

@Service
public class UserService {
    
    @Autowired
    UserDao userDao;
    
    public List<User> selectUserByUsername(String username) {
        return userDao.selectUserByUsername(username);
    }
}
