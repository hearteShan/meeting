package com.shan.meet.mapper;

import com.shan.meet.entity.Signin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public interface SigninMapper extends BaseMapper<Signin> {
List<Signin> GetList();

    int insertO(@Param("signin") Signin signin);
    List<LocalDateTime> GetListud(@Param("id") int id);
    List<Signin> getByUserid(@Param("userid") int userid,@Param("limit")int limit,@Param("page") int page);
}
