package com.bjpowernode.springboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/boot")
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody
    Object HelloWorld() {

        return "Hello World";
    }

}
