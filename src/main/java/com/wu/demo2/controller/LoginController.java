package com.wu.demo2.controller;

import com.wu.demo2.mapper.UserMapper;
import com.wu.demo2.modals.User;
import com.wu.demo2.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired(required = false)
    private UserMapper userMapper;

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model
    ) {
        User user = new User(username, password);
        User reUser = userMapper.userLogin(user);
        //if(username.equals("admin") && password.equals("123456")) {
        if(reUser != null) {
            model.addAttribute("uname", reUser);
            model.addAttribute("title_ss", "各单位值班状态--" + DateUtil.timeStamp2Date(DateUtil.nowTime(), "yyyy年M月d日"));
            //model.addAttribute("uname", "武大卫 <span class='caret'></span>");
            return "main";
        } else {
            model.addAttribute("errorMsg", "用户名或密码错误！！！");
            return "index";
        }
    }
}
