package me.xueyao.ssh.controller;

import me.xueyao.ssh.pojo.User;
import me.xueyao.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XueYao
 * @date 2017-12-11
 */
@RequestMapping("user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list")
    public String toUser() {
        return "list";
    }

    @RequestMapping("{pageName}")
    public String toUserAdd(@PathVariable("pageName") String pageName) {
        return pageName;
    }

    @RequestMapping(value = "save")
    @ResponseBody
    public String addUser(User user) {
        this.userService.addUser(user);
        return "list";
    }
}
