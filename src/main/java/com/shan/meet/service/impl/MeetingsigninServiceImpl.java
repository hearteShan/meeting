package com.shan.meet.service.impl;

import com.shan.meet.entity.Meetingsignin;
import com.shan.meet.mapper.MeetingsigninMapper;
import com.shan.meet.service.MeetingsigninService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shan
 * @since 2020-02-29
 */
@Service
public class MeetingsigninServiceImpl extends ServiceImpl<MeetingsigninMapper, Meetingsignin> implements MeetingsigninService {
@Autowired(required = false)
MeetingsigninMapper meetingsigninMapper;
    @Override
    public List<Meetingsignin> GetList() {
        return meetingsigninMapper.GetList();
    }

    @Override
    public List GetListById(int id) {
        return meetingsigninMapper.getListById(id);
    }
}
