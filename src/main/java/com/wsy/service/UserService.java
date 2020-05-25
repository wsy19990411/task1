package com.wsy.service;

import com.wsy.dao.UserDao;
import com.wsy.domain.User;
import com.wsy.enums.MsgEnums;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Service
@Slf4j
public class UserService {
    @Autowired
    private UserDao userDao;

    public User login(HttpServletRequest request, String mobile, String password) {
        if (mobile == null || mobile.length() == 0 || password == null) {
            return null;
        }
        User user = userDao.getById(mobile);
        if (user == null) {
            return null;
        }
        request.getSession().setAttribute(MsgEnums.SESSION_MSG.getMsg(), user);
        return user;
    }
}
