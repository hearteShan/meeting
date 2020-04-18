package com.shan.meet.service.impl;

import com.shan.meet.entity.Meeting;
import com.shan.meet.mapper.MeetingMapper;
import com.shan.meet.service.MeetingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
@Service
public class MeetingServiceImpl extends ServiceImpl<MeetingMapper, Meeting> implements MeetingService {
@Autowired
MeetingMapper meetingMapper;
    @Override
    public List<Meeting> GetList() {
        return meetingMapper.GetList();
    }

    @Override
    public int insertO(Meeting meeting) {
        return meetingMapper.insertO(meeting);
    }

    @Override
    public int updateOne(Meeting meeting) {
        return meetingMapper.updateOne(meeting);
    }

    @Override
    public List<Meeting> getByTime(int departid, LocalDateTime time) {
        return meetingMapper.getByTime(departid,time);
    }
}
