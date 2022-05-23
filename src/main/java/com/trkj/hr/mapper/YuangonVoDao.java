package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface YuangonVoDao extends BaseMapper<YuangonVo> {
    @Select("select a.*,b.*,d.sbmc,e.zwmc,f.bmmc\n" +
            "from yuangongbiao as a inner join Rencaizibiao as b  inner join shebaofananbiao as d inner join zhiweibiao as e inner join bumenbiao as f\n" +
            "on a.rzbh= b.rzbh  and a.sbbh=d.sbbh and a.zwbh= e.zwbh and e.bmbh=f.bmbh ${ew.customSqlSegment} ")
    IPage<YuangonVo> selPageAllEmpSb(Page<YuangonVo> page, @Param(Constants.WRAPPER) QueryWrapper<YuangonVo> queryWrapper);
}
