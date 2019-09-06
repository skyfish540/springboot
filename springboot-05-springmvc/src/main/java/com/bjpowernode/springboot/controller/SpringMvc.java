package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
//@Controller
@RestController     //springboot特有的注解，作用相当于@Controller+@ResponseBody
@RequestMapping("/boot")

public class SpringMvc {

    @RequestMapping("/springmvc")
    public String testSpringMvc(Model model){

        model.addAttribute("msg", "Hello SpringMVC");

        return "springmvc";
    }

    @RequestMapping("/testRestController")
    public Object testRestController(){
        User user =new User();
        user.setUserId(20);
        user.setUname("露西");
        user.setLoginName("lucy");
        user.setEmail("12345ytf");
        return user;
    }

    //RESTFul风格的编程,需要用到注解@PathVariable
    //http://127.0.0.1:8080/springboot-05-springmvc/boot/testRestful/1001/lily
    @RequestMapping("/testRestful/{id}/{name}")
    public Object testRestful(@PathVariable("id")Integer id,
                              @PathVariable("name")String name){

        return "id="+id+",name="+name;
    }

}
