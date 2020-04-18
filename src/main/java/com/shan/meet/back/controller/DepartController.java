package com.shan.meet.back.controller;


import com.shan.meet.System.util.R;
import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Depart;
import com.shan.meet.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    DepartService departService;

    @RequestMapping("/list")
    public TableR table() {
        TableR tableR=new TableR();
        int count=(int)departService.count();
        tableR.setCount(count);
        List<Depart> departsList=departService.list();
        System.out.println(departsList);
        tableR.setData(departsList);
        return tableR;

    }

    @RequestMapping("/delete")
    public R delete(int id) {
        boolean i = departService.removeById(id);
        if (i) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @RequestMapping("/selectById")
    public ModelAndView selectById(int id) {
        System.out.println(id);
        Depart depart = departService.getById(id);
        System.out.println(depart);
        ModelAndView mv = new ModelAndView();
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", depart.getId().toString());

        map.put("name", depart.getName());
        map.put("number", depart.getNumber().toString());
        mv.addObject("map", map);

        mv.setViewName("redirect:depart_edit.html");
        System.out.println(mv);
        return mv;
    }

    @RequestMapping("/edit")
    public R edit(Depart depart) {
        Boolean b = departService.updateById(depart);
        if (b) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @RequestMapping("/add")
    public void add(Depart depart) {
        System.out.println(1);
        int b = departService.insertO(depart);
        System.out.println(b);
    }
}
