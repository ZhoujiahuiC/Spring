package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.vo.MianshiguizhanbiaoVo;
import com.trkj.hr.vo.RencaiVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Rencaibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:42
 */
@Mapper
public interface RencaibiaoDao extends BaseMapper<Rencaibiao> {

    @Select("select r.*,rz.*,z.zwmc,b.bmmc from rencaibiao r \n" +
            "LEFT JOIN zhiweibiao z on r.zwbh=z.zwbh \n" +
            "LEFT JOIN rencaizibiao rz on r.rzbh=rz.rzbh\n" +
            "LEFT JOIN bumenbiao b on rz.bmbh=b.bmbh ${ew.customSqlSegment}")
    IPage<RencaiVo> selRc(Page<RencaiVo> page, @Param(Constants.WRAPPER) QueryWrapper<RencaiVo> queryWrapper);

}

