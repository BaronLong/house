package com.mooc.house.serveice.impl;

import com.mooc.house.common.model.User;
import com.mooc.house.mapper.UserMapper;
import com.mooc.house.serveice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
