package com.crud.demo.starter.controller;

import com.crud.demo.starter.entity.User;
import com.crud.demo.starter.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public ModelAndView login(){
        ModelAndView mav =new ModelAndView("index");
        List<User> list =userService.getAll();
        System.out.println(list);
        mav.addObject("list",list);
        return mav;
    }
/*
    @RequestMapping("/login")
    public ModelAndView login(User user, ModelAndView mv,
                              HttpSession session
                             ) {
//        ModelAndView mav =new ModelAndView();
        System.out.println(user);
   *//*     User login = userServer.userLogin(user.getUsername(), user.getPassword());
        System.out.println(login);
        if (login != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            session.setAttribute("login", login);
            System.out.println("Hellow world");
            mv.setViewName("view");
        } else {
            map.put("msg","用户名或密码错误");
            System.out.println("失败");
            mv.setViewName("login");
        }*//*
        mv.setViewName("index");
        return mv;
    }*/
    @RequestMapping("/")
    public String index(){
        ModelAndView modelAndView =new ModelAndView("login");

        return "hello world";
    }
}
