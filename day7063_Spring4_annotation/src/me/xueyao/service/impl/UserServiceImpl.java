package me.xueyao.service.impl;

import org.springframework.stereotype.Component;

import me.xueyao.service.UserService;
//注解  组件value="userService",value可以省略
@Component("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("业务层：保存");
    }

}
