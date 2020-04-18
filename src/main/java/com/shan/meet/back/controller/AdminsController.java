package com.shan.meet.back.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shan.meet.System.util.R;
import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Admins;
import com.shan.meet.service.AdminsService;
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
@RequestMapping("/admins")
public class AdminsController {
    @Autowired
    AdminsService adminsService;
    @RequestMapping("/login")
    public R login(Admins admins){
        //System.out.println(1);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", admins.getUsername());
        queryWrapper.eq("password", admins.getPassword());
        Admins one = adminsService.getOne(queryWrapper);
        if (one != null) {
            // System.out.println(1);
            return R.ok();
        } else {
            // System.out.println(1);
            return R.error();
        }
    }
    @RequestMapping("/list")
    public R list(){
        List<Admins> list = adminsService.list();

        return R.ok().put("list",list);
    }
    @RequestMapping("/table")
    public TableR table(){
        List<Admins> list = adminsService.list();
        TableR tableR = new TableR();
        tableR.setData(list);
        int count = adminsService.count();
        tableR.setCount(count);
        return tableR;
    }

}
