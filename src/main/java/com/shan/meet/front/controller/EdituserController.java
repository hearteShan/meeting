package com.shan.meet.front.controller;

import com.shan.meet.System.util.R;
import com.shan.meet.entity.User;
import com.shan.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EdituserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/edit")
    public R edit(User user){
        System.out.println(user);
        int i = userService.updateOne(user);
        System.out.println(1);
        if(i>0){
            System.out.println("修改成功");
            return R.ok();
        }else{
            System.out.println("修改失败");
            return R.error();
        }
    }
    @RequestMapping("/edituser")
    public ModelAndView GetOne(int id) {
        ModelAndView mv = new ModelAndView();
        System.out.println(id);
        User u = userService.getByid(id);
        System.out.println(u);
        mv.addObject("user", u);
        mv.setViewName("user_edit");
        return mv;
    }
}
