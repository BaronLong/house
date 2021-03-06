package com.mooc.house.controller;

import com.mooc.house.common.model.User;
import com.mooc.house.serveice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/")
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping ("hello")
    public String hello(ModelMap modelMap){
        List<User> users = userService.getUsers();
        User one = users.get(0);
        modelMap.put("user",one);
        return  "hello";
    }

    @RequestMapping("index")
    public String index(){
        return "homepage/index";
    }

}
