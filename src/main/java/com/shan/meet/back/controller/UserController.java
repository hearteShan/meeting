package com.shan.meet.back.controller;


import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.User;
import com.shan.meet.service.UserService;
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
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    UserService userService;
@RequestMapping("/list")
    public TableR list(){
    TableR tableR=new TableR();
    int count=(int)userService.count();
    tableR.setCount(count);
    List<User> userList=userService.GetList();
    System.out.println(userList);
    tableR.setData(userList);
    return tableR;
}
    @RequestMapping("/delete")
    public void delete(int id){
       userService.removeById(id);
    }
    @RequestMapping("/selectById")
    public String selectbyid(int id){
        userService.getById(id);
        return "static/user/user_add.html";
    }
    @RequestMapping("/add")
    public void add(User user){
      int a=  userService.insertO(user);
      System.out.println(a);
    }
}
