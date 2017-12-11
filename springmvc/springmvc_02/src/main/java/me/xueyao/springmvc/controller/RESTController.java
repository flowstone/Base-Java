package me.xueyao.springmvc.controller;

import me.xueyao.springmvc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-11
 */
@RequestMapping("rest")
@RestController
public class RESTController {
    @RequestMapping("/show01")
    public String test01() {
        return "hello";
    }

    @RequestMapping("/show02")
    public List<User> test02() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(1+i);
            user.setUsername("xiaoming"+i);
            user.setAge(18+i);
            users.add(user);
        }
        return users;
    }
}
