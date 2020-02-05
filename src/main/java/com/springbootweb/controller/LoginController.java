package com.springbootweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String Login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            return "dashboard";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }


    }

}
