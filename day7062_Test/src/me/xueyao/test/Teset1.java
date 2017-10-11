package me.xueyao.test;

import me.xueyao.service.UserService;
import me.xueyao.service.impl.UserServiceImpl;

public class Teset1 {
    
    public void test() {
        UserService userService = new UserServiceImpl();
        userService.save();
    }
}
