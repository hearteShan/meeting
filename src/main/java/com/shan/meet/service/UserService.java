package com.shan.meet.service;

import com.shan.meet.entity.User;
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
public interface UserService extends IService<User> {

    List<User> GetList();

    User getByid(int id);

    User GetONe(int id);

    int insertO(User user);
    int updateOne(User user);
}
