package com.shan.meet.mapper;

import com.shan.meet.entity.User;
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
public interface UserMapper extends BaseMapper<User> {

 List<User> GetList();
 User getByid(int id);
 User GetONe(int id);
 int insertO(@Param("user")User user);
 int updateOne(@Param("user") User user);
}
