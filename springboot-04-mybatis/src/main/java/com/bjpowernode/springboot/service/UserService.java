package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.mapper.UserMapper;
import com.bjpowernode.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */

public interface UserService {

    int addUser(User user);

    List<User> queryAllUser();

    int deletUser(Integer userId);

    User queryUserByUserId(Integer userId);

    int alterUser(User user);
}
