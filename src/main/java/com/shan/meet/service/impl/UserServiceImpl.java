package com.shan.meet.service.impl;

import com.shan.meet.entity.User;
import com.shan.meet.mapper.UserMapper;
import com.shan.meet.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
@Autowired
private UserMapper userMapper;
    @Override
    public List<User> GetList() {
        return userMapper.GetList();
    }

    @Override
    public User getByid(int id) {
        return userMapper.getByid(id);
    }

    @Override
    public User GetONe(int id) {
        return userMapper.GetONe(id);
    }

    @Override
    public int insertO(User user) {
        return userMapper.insertO(user);
    }

    @Override
    public int updateOne(User user) {
        return userMapper.updateOne(user);
    }


}
