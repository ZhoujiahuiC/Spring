package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.apache.ibatis.annotations.Mapper;
import com.trkj.hr.pojo.ygxxbiao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;


import java.util.List;
@Mapper
@Repository
public interface YuangongxxbiaoDao extends BaseMapper<ygxxbiao> {
    //根据id查询个人信息
    List<ygxxbiao> selctyuangongbiao(@Param("ybh") int ybh);
    //分页查询员工信息可根据name模糊查询
    @Select("select a.*,b.rzname,b.rzsex,b.rzcsrq,b.rzage,b.rzxl,b.rzsfz,b.rzphone,b.rzdz,b.rzgzjl,b.rzhyzk,b.rzmz,b.rzzzmm,b.rzqqyx,b.tp,c.bcmc,c.bckssj,c.bcjssj,d.sbmc,e.zwmc,f.bmmc   from yuangongbiao as a inner join Rencaizibiao as b inner join bancibiao as c inner join shebaofananbiao as d inner join zhiweibiao as e inner join bumenbiao as f on a.rzbh= b.rzbh and a.bcbh=c.bcbh and a.sbbh=d.sbbh and a.zwbh= e.zwbh and e.bmbh=f.bmbh ${ew.customSqlSegment}")
    IPage<ygxxbiao> selctyuangongguanli(Page<ygxxbiao> page, @Param(Constants.WRAPPER)QueryWrapper<ygxxbiao> queryWrapper);
    //根据员工状态分页查询
    @Select("select a.*,b.rzname,b.rzsex,b.rzcsrq,b.rzage,b.rzxl,b.rzsfz,b.rzphone,b.rzdz,b.rzgzjl,b.rzhyzk,b.rzmz,b.rzzzmm,b.rzqqyx,b.tp,c.bcmc,c.bckssj,c.bcjssj,d.sbmc,e.zwmc,f.bmmc   from yuangongbiao as a inner join Rencaizibiao as b inner join bancibiao as c inner join shebaofananbiao as d inner join zhiweibiao as e inner join bumenbiao as f on a.rzbh= b.rzbh and a.bcbh=c.bcbh and a.sbbh=d.sbbh and a.zwbh= e.zwbh and e.bmbh=f.bmbh ${ew.customSqlSegment}")
    IPage<ygxxbiao> selectygzt(Page<ygxxbiao> page, @Param(Constants.WRAPPER)QueryWrapper<ygxxbiao> queryWrapper);
}
