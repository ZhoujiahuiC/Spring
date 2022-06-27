package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.vo.XzdaVo;
import com.trkj.hr.vo.YgcanbaoVo;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface XzdaDao extends BaseMapper<XzdaVo> {
    @Select("SELECT y.*,z.*,r.*,b.*,j.* from yuangongbiao y LEFT JOIN rencaizibiao r on y.rzbh=r.rzbh \n" +
            "LEFT JOIN  zhiweibiao z on y.zwbh=z.zwbh \n" +
            "LEFT JOIN  bumenbiao b on z.bmbh=b.bmbh \n" +
            "LEFT JOIN  xinzijibengongzibiao j on j.zwbh=z.zwbh ${ew.customSqlSegment}")
    IPage<XzdaVo> selPageAll(Page<XzdaVo> page, @Param(Constants.WRAPPER) QueryWrapper<XzdaVo> queryWrapper);
}
