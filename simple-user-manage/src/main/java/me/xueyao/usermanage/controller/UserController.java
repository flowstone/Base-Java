package me.xueyao.usermanage.controller;

import me.xueyao.usermanage.pojo.EasyUIResult;
import me.xueyao.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("users")
    public String toUser() {
        return "users";
    }

    @RequestMapping("list")
    @ResponseBody
    public EasyUIResult queryUsersByPage(@RequestParam("page") Integer pageNum,@RequestParam("rows") Integer pageSize) {
        return this.userService.queryEasyUIResult(pageNum, pageSize);

    }
}
