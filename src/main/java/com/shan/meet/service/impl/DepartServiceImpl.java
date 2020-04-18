package com.shan.meet.service.impl;

import com.shan.meet.entity.Depart;
import com.shan.meet.mapper.DepartMapper;
import com.shan.meet.service.DepartService;
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
 * @since 2020-02-26
 */
@Service
public class DepartServiceImpl extends ServiceImpl<DepartMapper, Depart> implements DepartService {
@Autowired()
DepartMapper departMapper;
    @Override
    public List<Depart> GetList() {
        return departMapper.GetList();
    }

    @Override
    public int insertO(Depart depart) {
        return departMapper.insertO(depart);
    }
}
