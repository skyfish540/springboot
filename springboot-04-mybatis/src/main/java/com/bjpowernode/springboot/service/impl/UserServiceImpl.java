package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.UserMapper;
import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service("userService")

public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {

        return userMapper.insert(user);
    }

    @Transactional
    @Override
    public List<User> queryAllUser() {
        return userMapper.selectAllUser();
    }

    @Transactional
    @Override
    public int deletUser(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public User queryUserByUserId(Integer userId)
    {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Transactional
    @Override
    public int alterUser(User user) {
        int updateUserCount=userMapper.updateByPrimaryKeySelective(user);

        //int i=10/0;  //制造异常，测试事务管理

        return updateUserCount;
    }
}
