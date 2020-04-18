package com.shan.meet.service;

import com.shan.meet.entity.Depart;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shan
 * @since 2020-02-26
 */
public interface DepartService extends IService<Depart> {
List <Depart> GetList();


    int insertO(Depart depart);
}
