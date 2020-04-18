package com.shan.meet.back.controller;


import com.shan.meet.System.util.R;
import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Meeting;
import com.shan.meet.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
@RestController
@RequestMapping("/meeting")
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @RequestMapping("/list")
    public TableR list() {
        TableR tableR = new TableR();
        int count = (int) meetingService.count();
        tableR.setCount(count);
        List<Meeting> meetings = meetingService.GetList();
        //System.out.println(meetings);
        tableR.setData(meetings);
        return tableR;
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        meetingService.removeById(id);
    }

    @RequestMapping("/selectById")
    public String selectbyid(int id) {
        meetingService.getById(id);
        return "static/meeting/meeting_edit.html";
    }

    @RequestMapping("/add")
    public R add(Meeting meeting) {
        int i = meetingService.insertO(meeting);
        if (i>0){
            return R.ok();
        }else {
            return R.error();
        }
    }

    @RequestMapping("/edit")
    public R edit(Meeting meeting) {
        int i = meetingService.updateOne(meeting);
        if (i > 0) {
            return R.ok();
        } else {
            return R.error();
        }

    }
}
