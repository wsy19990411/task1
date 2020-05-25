package com.wsy.controller;


import com.wsy.domain.User;
import com.wsy.enums.MsgEnums;
import com.wsy.result.Result;
import com.wsy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
@Slf4j
public class Login {

    @Autowired
    private UserService userService;

    @RequestMapping("/to_login")
    public String login() {
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<User> dologin(HttpServletRequest request, @RequestParam("mobile") String mobile, @RequestParam("password") String password) {
        User user = userService.login(request, mobile, password);
        return Result.success(user);
    }

    @RequestMapping("/tohome")
    public String success(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(MsgEnums.SESSION_MSG.getMsg());
        if (user == null) {
            return "login";
        }

        return "home";
    }
}
