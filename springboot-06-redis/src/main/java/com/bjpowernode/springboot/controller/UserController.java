package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


/**
 *
 */
@RestController
@RequestMapping("/boot")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/testRedis/{id}")
    //http://127.0.0.1:8080/springboot-06-redis/boot/testRedis/1001
    public Object testRedis(@PathVariable("id") Integer id) throws ExecutionException, InterruptedException {
        //单线程处理
        User user=null;
        /*user=userService.queryUserById(id);
        return user;*/
        /*Executors:
		ExecutorService newFixedThreadPool() : 创建固定大小的线程池
		ExecutorService newCachedThreadPool() ： 缓存线程池，线程池的数量不固定，可以根据需求自动的更改数量。
		ExecutorService newSingleThreadExecutor() : 创建单个线程池。 线程池中只有一个线程*/

        //模拟多线程处理
        ExecutorService executorService= Executors.newFixedThreadPool(8);
        List<User> userList=new ArrayList<>();

        for (int i=0;i<100;i++){
            Future future=executorService.submit(new Callable(){
                public Object call() throws Exception {
                    //userService.queryUserById(id);
                    //System.out.println("Asynchronous Callable");

                    return userService.queryUserById(id);
                }
            });
            //System.out.println("future.get() = " + future.get());
            userList.add((User) future.get());
            user= (User) future.get();
        }

        //关闭在 ExecutorService 中的线程
        executorService.shutdown();

        System.out.println(userList.size());

        return user;

    }
}
