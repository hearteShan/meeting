package com.shan.meet.service;

import com.shan.meet.entity.Signin;
import com.baomidou.mybatisplus.extension.service.IService;

import java.time.LocalDateTime;
import java.util.List;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shan
 * @since 2020-02-29
 */
public interface SigninService extends IService<Signin> {
List<Signin> GetList();

    int insertO(Signin signin);

    List<LocalDateTime> GetListud(int id);

    List<Signin> getByUserid(int userid,int limit, int page);
}
