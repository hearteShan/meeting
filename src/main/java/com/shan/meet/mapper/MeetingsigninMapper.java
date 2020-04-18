package com.shan.meet.mapper;

import com.shan.meet.entity.Meetingsignin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shan.meet.entity.Meetingsignin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shan
 * @since 2020-02-29
 */
@Mapper
public interface MeetingsigninMapper extends BaseMapper<Meetingsignin> {
List<Meetingsignin> GetList();
    List<Meetingsignin> getListById(int id);
}

