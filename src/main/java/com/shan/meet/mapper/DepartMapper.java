package com.shan.meet.mapper;

import com.shan.meet.entity.Depart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

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
public interface DepartMapper extends BaseMapper<Depart> {
List<Depart> GetList();

int insertO(@Param("depart")Depart depart);
}
