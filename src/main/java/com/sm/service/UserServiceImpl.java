package com.sm.service;

import com.sm.domain.User;
import com.sm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    public User selectUserByUsername(String username){
        if (username.length() == 0 & username.isEmpty() & username == null){
            return null;
        }
        return userMapper.selectUserByUsername(username);
    }
}
