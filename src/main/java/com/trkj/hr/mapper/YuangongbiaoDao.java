package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Select("select a.*,b.*,d.sbmc,e.zwmc,f.bmmc\n" +
            "from yuangongbiao as a inner join Rencaizibiao as b  inner join shebaofananbiao as d inner join zhiweibiao as e inner join bumenbiao as f\n" +
            "on a.rzbh= b.rzbh  and a.sbbh=d.sbbh and a.zwbh= e.zwbh and e.bmbh=f.bmbh ${ew.customSqlSegment} ")
    IPage<YuangonVo> selPageAllEmpSb(Page<YuangonVo> page, @Param(Constants.WRAPPER) QueryWrapper<YuangonVo> queryWrapper);
    //修改员工参保方案
    @Update("update yuangongbiao y set y.sbbh=#{sbbh} where y.ybh=#{ybh}")
    int upEmpcbfa(@Param("ybh") Integer ybh, @Param("sbbh") Integer sbbh);

}

