package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.User;

public interface UserService {

    User queryUserById(Integer id);
}
