package com.bjpowernode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
@RequestMapping("/boot")
public class JSPController {

    @RequestMapping("/test")
    public String testJSP(Model model){

        model.addAttribute("msg", "JSP测试,成功");

        return "test";
    }

    @RequestMapping("/json")
    public @ResponseBody Object testJson(){

        return "Hello Json";
    }
}
