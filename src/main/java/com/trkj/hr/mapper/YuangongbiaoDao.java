package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Yuangongbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * (Yuangongbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:33
 */
@Mapper
public interface YuangongbiaoDao extends BaseMapper<Yuangongbiao> {
    //统计员工状态各人数
    @Select("SELECT \n" +
            "sum(case when ygzt=1 then 1 else 0 end) zs,\n" +
            "sum(case when ygzt=2 then 1 else 0 end) sx,\n" +
            "sum(case when ygzt=3 then 1 else 0 end) drz,\n" +
            "sum(case when ygzt=4 then 1 else 0 end) dlz,\n" +
            "sum(case when ygzt=5 then 1 else 0 end) ylz\n" +
            "FROM yuangongbiao ")
    List<Yuangongbiao> tongji();

}

