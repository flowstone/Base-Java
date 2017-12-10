package me.xueyao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author XueYao
 * @date 2017-12-10
 */
@Controller
public class HelloController {

    @RequestMapping(value = "show01")
    public ModelAndView test01() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC测试方法");
        return mv;
    }
}
