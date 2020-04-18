package com.shan.meet.service.impl;

import com.shan.meet.entity.Signin;
import com.shan.meet.mapper.SigninMapper;
import com.shan.meet.service.SigninService;
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
public class SigninServiceImpl extends ServiceImpl<SigninMapper, Signin> implements SigninService {
@Autowired
private SigninMapper signinMapper;
    @Override
    public List<Signin> GetList() {
        return signinMapper.GetList();
    }

    @Override
    public int insertO(Signin signin) {
        return signinMapper.insertO(signin);
    }

    @Override
    public List GetListud(int id) {
        return signinMapper.GetListud(id);
    }

    @Override
    public List<Signin> getByUserid(int userid, int limit, int page) {
        return signinMapper.getByUserid(userid,limit,page);
    }


}
