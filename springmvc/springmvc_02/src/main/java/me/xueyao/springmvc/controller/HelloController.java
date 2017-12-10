package me.xueyao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

    @RequestMapping(value = "show017")
    public ModelAndView test017(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        ModelAndView mv = new ModelAndView("hello");
        StringBuilder sb = new StringBuilder();
        sb.append("request:" + request + "<br/>");
        sb.append("response:" + response + "<br/>");
        sb.append("session:" + session + "<br/>");
        mv.addObject("msg", "springmvc接收参数与数据绑定：内置参数：" + sb.toString());
        return mv;
    }

    @RequestMapping(value = "show018")
    public String test018(Model model, ModelMap modelMap) {
        model.addAttribute("msg", "SpringMVC接收参数与数据绑定：特有内置参数model");
        modelMap.addAttribute("msg", "SpringMVC接收参数与数据绑定：特有内置参数ModelMap");

        return "hello";
    }

    @RequestMapping(value = "/show019/{name}")
    public String test019(Model model, @PathVariable("name") String name) {
        model.addAttribute("msg", "SpringMVC接收参数与数据绑定：占位符" + name);
        return "hello";
    }

    @RequestMapping(value = "/show020")
    public String test020(Model model, @RequestParam("id") Long id) {
        model.addAttribute("msg", "StringMVC接收参数与数据绑定：接收普通参数:" + id);
        return "hello";
    }

    @RequestMapping(value = "/show021")
    public String test021(Model model, @RequestParam(value = "id",required = false) Long id) {
        model.addAttribute("msg", "StringMVC接收参数与数据绑定：接收普通参数：" + id);
        return "hello";
    }

    @RequestMapping(value = "/show022")
    public String test022(Model model, @RequestParam(value = "id",required = true, defaultValue = "abc") String id){
        model.addAttribute("msg", "StringMVC接收参数与数据绑定：接收普通 参数：" + id);
        return "hello";
    }

}
