package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Rencaizibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Rencaizibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:49
 */
@Mapper
public interface RencaizibiaoDao extends BaseMapper<Rencaizibiao> {
    //统计男女人数
    @Select("SELECT bm.bmbh,\n" +
            "sum(case when r.rzsex='男' then 1 else 0 end)  nan,\n" +
            "sum(case when r.rzsex='女' then 1 else 0 end) nv\n" +
            "FROM rencaizibiao r RIGHT  JOIN  bumenbiao bm on r.bmbh=bm.bmbh GROUP BY bm.bmbh")
    List<Rencaizibiao> tjnv();

}

