package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.YgybVo;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.vo.YuangonVo;
import com.trkj.hr.vo.Yuangongx1Vo;
import com.trkj.hr.vo.YuangongxxVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.security.access.method.P;

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
    //    修改员工基本工资
    @Update("update yuangongbiao y set y.xzjbgz=#{xzjbgz} where y.ybh=#{ybh}")
    int upygjbgz(@Param("ybh") int ybh, @Param("xzjbgz")Double xzjbgz);

    public List<YuangongxxVo> selectxx ();

    @Select("SELECT \n" +
            "sum(case when kqsbzt=1 and kqxbzt=2 then 1 else 0 end) zc,\n" +
            "sum(case when kqsbzt=1 and kqxbzt=4 then 1 else 0 end) zt,\n" +
            "sum(case when kqsbzt=3 and kqxbzt=4 then 1 else 0 end) cd,\n" +
            "sum(case when kqsbzt=5 and kqxbzt=5 then 1 else 0 end) kg,\n" +
            "sum(case when kqsbzt=7 and kqxbzt=7 then 1 else 0 end) qj,\n" +
            "sum(case when kqsbzt=8 and kqxbzt=8 then 1 else 0 end) cc\n" +
            "FROM kaoqinjilubiao \n" +
            "${ew.customSqlSegment}")
    YgybVo selYbcc(@Param(Constants.WRAPPER) QueryWrapper<YgybVo> queryWrapper);

    public List<YuangongxxVo> selectxxId(int ybh);
    public List<Yuangongx1Vo> selectx1Id(int ybh);
    public List<Yuangongx1Vo> selectx2Id(int bmbh ,int ybh);

}

