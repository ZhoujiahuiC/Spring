package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Liuchengrenyuan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository  //持久层
@Mapper
public interface LiuchengrenyuanDao extends BaseMapper<Liuchengrenyuan> {
}
