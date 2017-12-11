package me.xueyao.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XueYao
 * @date 2017-12-11
 */
@RequestMapping("user")
@Controller
public class UserController {

    @RequestMapping(value = "users")
    public String toUser() {
        return "users";
    }
}
