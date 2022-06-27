package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Mianshiguizhanbiao;
import com.trkj.hr.vo.MianshiguizhanbiaoVo;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Mianshiguizhanbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:48
 */
@Mapper
public interface MianshiguizhanbiaoDao extends BaseMapper<Mianshiguizhanbiao> {

    @Select("SELECT m.*,mz.*,z.*,y1.ybh ybh1,rz.rzbh rzbh,b.bmbh,b.bmmc,rz.rzname rzname,rz1.rzbh rzbh1,rz1.rzname rzname1 from mianshiguizhanbiao m \n" +
            "LEFT JOIN mianshiguizhanzibiao mz on m.mbh=mz.mbh \n" +
            "LEFT JOIN zhiweibiao z on m.zwbh=z.zwbh \n" +
            "LEFT JOIN bumenbiao b on b.bmbh=z.bmbh\n" +
            "LEFT JOIN  yuangongbiao y on m.ybh=y.ybh \n" +
            "LEFT JOIN rencaizibiao rz on y.rzbh=rz.rzbh\n" +
            "LEFT JOIN yuangongbiao y1 on mz.ybh=y1.ybh\n" +
            "LEFT JOIN rencaizibiao rz1 on y1.rzbh=rz1.rzbh ${ew.customSqlSegment}")
    IPage<MianshiguizhanbiaoVo> selMsgz(Page<MianshiguizhanbiaoVo> page, @Param(Constants.WRAPPER) QueryWrapper<MianshiguizhanbiaoVo> queryWrapper);

}

