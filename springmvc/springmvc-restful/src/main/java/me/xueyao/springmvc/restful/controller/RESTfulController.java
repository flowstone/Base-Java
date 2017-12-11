package me.xueyao.springmvc.restful.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XueYao
 * @date 2017-12-11
 */
@RequestMapping("rest")
@RestController
public class RESTfulController {

    @RequestMapping("/show01")
    public String test01() {
        return "hello";
    }
}
