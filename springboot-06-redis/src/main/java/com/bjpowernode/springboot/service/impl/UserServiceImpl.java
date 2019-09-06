package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;

import java.util.concurrent.TimeUnit;

/**
 *
 */
@Controller("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public User queryUserById(Integer id) {
        //设置key的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        User user = null;
        synchronized (this) {
            user = (User) redisTemplate.opsForValue().get("UserKey" + id);
            if (user == null) {
                //查询数据库，现在是模拟查询数据库
                user = new User();
                user.setUserId(id);
                user.setUname("lily");
                user.setLoginName("admin");
                user.setPassword("123");
                user.setEmail("hello@163.com");
                System.out.println("---从数据库中取数据--");
                //把student保存到redis中
                redisTemplate.opsForValue().set("UserKey" + id, user,15, TimeUnit.MINUTES);

            } else {
                System.out.println("===从redis中取数据===");
            }
        }

        return user;
    }
}
