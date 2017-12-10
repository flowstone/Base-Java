package me.xueyao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author XueYao
 * @date 2017-12-09
 */
@RequestMapping("hello")
@Controller
public class Hello2Controller{
    
    @RequestMapping(value="show1")
    public ModelAndView test01() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "这是一个SpringMVC注解程序");
        
        return mv;
    }
    
    @RequestMapping(value="sss?/show2")
    public ModelAndView test02() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之通配符:?");
        
        return mv;
    }
    @RequestMapping(value="aa*/show3")
    public ModelAndView test03() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之通配符:*");
        
        return mv;
    }
    
    @RequestMapping(value="**/show4")
    public ModelAndView test04() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之通配符:**");
        
        return mv;
    }
    
    @RequestMapping(value="show5/{name}/{id}")
    public ModelAndView test05(@PathVariable("name") String name, @PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之点位符name:"+name+",id:"+id);
        
        return mv;
    }
    
    @RequestMapping(value="show6",method=RequestMethod.POST)
    public ModelAndView test06() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求方法");
        
        return mv;
    }
    
    @RequestMapping(value="show7",method={RequestMethod.POST,RequestMethod.DELETE})
    public ModelAndView test07() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求方法多个");
        return mv;
    }
    
    @RequestMapping(value="show8",params="id")
    public ModelAndView test08() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求参数id");
        return mv;
    }
    
    @RequestMapping(value="show9",params="id=1")
    public ModelAndView test09() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求参数id=1");
        return mv;
    }
    
    
    @RequestMapping(value="show10",params="id!=1")
    public ModelAndView test10() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求参数id!=1");
        return mv;
    }
    
    @RequestMapping(value="show11",params="!id")
    public ModelAndView test11() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求参数!id");
        return mv;
    }
    
    
    @RequestMapping(value="show12",params={"name","id"})
    public ModelAndView test12() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "SpringMVC请求路径之限定请求参数name,id");
        return mv;
    }
    
}
