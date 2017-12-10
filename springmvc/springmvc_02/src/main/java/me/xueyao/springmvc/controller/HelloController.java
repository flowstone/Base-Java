package me.xueyao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping(value = "show013")
    public ModelAndView test013() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "GetMapping");
        return mv;
    }

    @PostMapping(value = "show014")
    public ModelAndView test014() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "PostMapping");
        return mv;
    }

    @PutMapping(value = "show015")
    public ModelAndView test015() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "PutMapping");
        return mv;
    }

    @DeleteMapping(value = "show016")
    public ModelAndView test016() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "DeleteMapping");
        return mv;
    }
}
