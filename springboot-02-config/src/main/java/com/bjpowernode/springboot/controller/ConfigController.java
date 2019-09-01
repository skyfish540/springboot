package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping("/boot")
public class ConfigController {

    @Value("${user.userName}")
    private String userName;


    @Autowired
    private User user;

    @RequestMapping("/config")
    public @ResponseBody Object testConfig(){

        return "Test Config";
    }

    @RequestMapping("/showConfig")
    public @ResponseBody Object showConfig(){



        //return "user.name="+user.getUserName()+"user.age="+user.getAge()+"user.email="+user.getEmail();
        //return "userName="+userName;

        return user;

    }

}
