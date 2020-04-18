package com.shan.meet.service;

import com.shan.meet.entity.Meeting;
import com.baomidou.mybatisplus.extension.service.IService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
public interface MeetingService extends IService<Meeting> {

    List<Meeting> GetList();
    int insertO(Meeting meeting);
    int updateOne(Meeting meeting);
    List<Meeting> getByTime(int departid, LocalDateTime time);
}
