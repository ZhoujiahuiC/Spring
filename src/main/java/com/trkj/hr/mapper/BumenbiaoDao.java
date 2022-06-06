package com.trkj.hr.mapper;

import  com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Bumenbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * (Bumenbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:55:34
 */
@Mapper
public interface BumenbiaoDao extends BaseMapper<Bumenbiao> {
    @Select("SELECT bmmc,bmjs FROM bumenbiao")
    List<Bumenbiao> selectbmmc();
}

