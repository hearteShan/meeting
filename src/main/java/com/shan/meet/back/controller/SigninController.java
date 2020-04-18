package com.shan.meet.back.controller;


import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Signin;
import com.shan.meet.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shan
 * @since 2020-02-29
 */
@RestController
@RequestMapping("/signin")
public class SigninController {
    @Autowired
    SigninService signinService;
    @RequestMapping("/list")
    public TableR list(){
        List<Signin> list = signinService.GetList();
        TableR tableR = new TableR();
        System.out.println(list);
        tableR.setData(list);
        int count = signinService.count();
        System.out.println(count);
        tableR.setCount(count);
        return tableR;
    }
}
