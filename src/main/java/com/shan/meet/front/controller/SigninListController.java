package com.shan.meet.front.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Signin;
import com.shan.meet.entity.User;
import com.shan.meet.service.SigninService;
import com.shan.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class SigninListController {
    @Autowired
    SigninService signinService;

    @RequestMapping("/signinlist")
    public TableR list(int id,int page,int limit){
        int page1=(page-1)*limit;
        List list = signinService.getByUserid(id,limit,page1);
        TableR tableR = new TableR();
        tableR.setData(list);
        tableR.setCount(list.size());
        System.out.println(list);
        System.out.println("传输");
        System.out.println(tableR);
        return tableR;
    }
}
