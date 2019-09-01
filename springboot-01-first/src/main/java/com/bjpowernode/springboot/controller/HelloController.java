package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping("/boot")
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody
    Object HelloWorld() {

        return "Hello World";
    }

}
