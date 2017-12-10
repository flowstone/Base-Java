package me.xueyao.springmvc.controller;

import me.xueyao.springmvc.pojo.User;
import me.xueyao.springmvc.pojo.UserVO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author XueYao
 * @date 2017-12-10
 */
@RequestMapping("hello")
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

    @RequestMapping(value = "/show023")
    public String test023(@CookieValue("JSESSIONID") String jsessionId, Model model) {
        model.addAttribute("msg", "StringMVC的CookieValue:" + jsessionId);
        return "hello";
    }

    @RequestMapping(value = "/show024")
    @ResponseStatus(value = HttpStatus.OK)
    public void test024(@RequestParam("name") String name, @RequestParam("age") Integer age,
                        @RequestParam("isMarry") Boolean isMarry, @RequestParam("income") Double income,
                        @RequestParam("interests") String [] interests) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name:"+name+"\n");
        stringBuilder.append("age:"+age+"\n");
        stringBuilder.append("isMarry:" + isMarry+"\n");
        stringBuilder.append("income：" + income+"\n");
        stringBuilder.append("interests:[");
        for (String interest : interests) {
            stringBuilder.append(interest+" ");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());

    }

    @RequestMapping(value = "/show025")
    public String test025(User user,@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", user.toString() + "<br/>" + name);
        return "hello";
    }

    @RequestMapping(value = "/show026")
    public String test026(Model model, UserVO userVO) {
        model.addAttribute("msg", userVO.getUsers().toString());
        return "hello";
    }

    @RequestMapping(value = "/show027")
    public String test027(Model model) {
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(100+i);
            user.setUsername("xiaoming"+i);
            user.setName("小明"+i);
            user.setAge(10+i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        return "users";
    }


}
