package com.shan.meet.front.controller;

import com.shan.meet.System.util.TableR;
import com.shan.meet.entity.Meeting;
import com.shan.meet.entity.User;
import com.shan.meet.service.MeetingService;
import com.shan.meet.service.MeetingsigninService;
import com.shan.meet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MeetinghistoryController {
    @Autowired
    MeetingService meetingService;
    @Autowired
    UserService userService;
    @Autowired
    MeetingsigninService meetingsigninService;

    @RequestMapping("/meetinghistory")
    public TableR meetinghistory(int id){
        TableR tableR = new TableR();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(id);
        User user = userService.getByid(id);
        List<Meeting> byTime = meetingService.getByTime(user.getDepartid(), now);
        tableR.setData(byTime);
        tableR.setCount(byTime.size());
        return tableR;
    }
    @RequestMapping("/meetingsigninlist")
    public TableR meetingsigninlist(int id){
        TableR tableR = new TableR();
        User user = userService.getByid(id);
        Integer departid = user.getDepartid();
        List list = meetingsigninService.GetListById(departid);
        tableR.setData(list);
        tableR.setCount(list.size());
        return tableR;
    }
}
