package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.stereotype.Component;

/**
 *
 */
//相当于<dubbo:service interface="" timeout="">
@Service(interfaceClass = UserService.class,timeout = 1500)
@Component
public class UserServiceImpl implements UserService {


}
