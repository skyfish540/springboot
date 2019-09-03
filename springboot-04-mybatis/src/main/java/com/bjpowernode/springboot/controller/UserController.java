package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        System.out.println("======index方法======");

        return "userAdd";
    }

    @RequestMapping("/add")
    public String addUser(User user,Model model){
        //System.out.println(user);
        int result=userService.addUser(user);
        if (result>0){
            model.addAttribute("msg", "添加用户成功");
            return "redirect:/user/showList";
        }else {
            model.addAttribute("msg", "添加用户失败");
            return "msgBack";
        }
    }

    @RequestMapping("/showList")
    public String queryAllUser(Model model){

        List<User> userList=userService.queryAllUser();
        //System.out.println(userList);
        model.addAttribute("userList",userList);

        return "showList";
    }

    @RequestMapping("/delete")
    public String delete(Integer userId,Model model){
        int deleteUserCount=userService.deletUser(userId);
        if (deleteUserCount>0){
            return "redirect:/user/showList";
        }else {
            model.addAttribute("msg", "添加用户失败");
            return "msgBack";
        }
    }

    @RequestMapping("/toUpdate")
    public String updateUser(Integer userId,Model model ){

        return "toUpdate";
    }
}
