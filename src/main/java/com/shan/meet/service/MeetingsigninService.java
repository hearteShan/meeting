package com.shan.meet.service;

import com.shan.meet.entity.Meetingsignin;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shan
 * @since 2020-02-29
 */
public interface MeetingsigninService extends IService<Meetingsignin> {
    List<Meetingsignin>GetList();

    List GetListById(int id);
}
