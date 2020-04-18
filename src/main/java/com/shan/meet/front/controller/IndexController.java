package com.shan.meet.front.controller;

import com.shan.meet.System.util.R;
import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Signin;
import com.shan.meet.entity.User;
import com.shan.meet.service.SigninService;
import com.shan.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;


@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private SigninService signinService;




    @RequestMapping("/meetinghis")
    public ModelAndView history(int id) {
        ModelAndView mv = new ModelAndView();
        System.out.println(id);
        User u = userService.getByid(id);
        System.out.println(u);
        mv.addObject("user", u);
        mv.setViewName("meetinghistory");
        return mv;
    }
    @RequestMapping("/meetingsign")
    public ModelAndView ML(int id) {
        ModelAndView mv = new ModelAndView();
        System.out.println(id);
        User u = userService.getByid(id);
        System.out.println(u);
        mv.addObject("user", u);
        mv.setViewName("meetingsigninlist");
        return mv;
    }
    @RequestMapping("/signinList")
    public ModelAndView Demo(int id) {
        ModelAndView mv = new ModelAndView();
        System.out.println(id);
        mv.addObject("id", id);
        mv.setViewName("signinlist");
        return mv;
    }
    @RequestMapping("/signin")
    public R signin(int id) {
        System.out.println(id);
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Signin signin = new Signin();
        signin.setDatatime(localDateTime);
        System.out.println(signin.getDatatime());
        User user = userService.getByid(id);
        signin.setUserid(id);
        signin.setDepartid(user.getDepartid());
        List list = signinService.GetListud(id);
        List<LocalDate> list1 = new ArrayList<LocalDate>();
        for (Object o : list) {
            LocalDateTime l = (LocalDateTime) o;
            LocalDate localDate1 = l.toLocalDate();
            list1.add(localDate1);
        }
        boolean contains = list1.contains(localDate);
        if (contains) {
            System.out.println("已经签到过");
            return R.error("今日已签到");
        } else {
            System.out.println("1");
            signinService.insertO(signin);
            System.out.println("签到成功");
            return R.ok("签到成功");
        }
    }

}
