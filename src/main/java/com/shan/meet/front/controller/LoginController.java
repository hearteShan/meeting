package com.shan.meet.front.controller;

import com.shan.meet.entity.Signin;
import com.shan.meet.entity.User;
import com.shan.meet.mapper.SigninMapper;
import com.shan.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/login")
    public String login() {
        //System.out.println(1);
        return "login";
    }

    @RequestMapping("/loginin")
    public String loginin(User user) {
        int id = user.getId();
        String password = user.getPassword();
        User one = userService.getByid(id);
        //System.out.println(id);
        //System.out.println(password);
        //System.out.println(one);
        if (one != null) {
            if (one.getPassword().equals(password)) {
                System.out.println(1);
                String username = one.getUsername();
                request.getSession().setAttribute("user",one);
                request.getSession().setAttribute("username",username);
                request.getSession().setAttribute("id",id);
                //System.out.println(R.ok());
                //return R.ok();
                return "Index";

            } else {
                System.out.println(2);
                return "login";
                //return R.error();
            }
            // System.out.println(1);

        } else {
            System.out.println(3);
            ;
            // System.out.println(1);
            return "login";
            //return R.error();
        }
    }
}
