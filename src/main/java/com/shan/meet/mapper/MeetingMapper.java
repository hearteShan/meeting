package com.shan.meet.mapper;

import com.shan.meet.entity.Meeting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;
/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
@Mapper
public interface MeetingMapper extends BaseMapper<Meeting> {
List<Meeting> GetList();
int insertO(Meeting meeting);
int updateOne(@Param("meeting") Meeting meeting);
List getByTime(@Param("time")int departid, @Param("time") LocalDateTime time);
}
