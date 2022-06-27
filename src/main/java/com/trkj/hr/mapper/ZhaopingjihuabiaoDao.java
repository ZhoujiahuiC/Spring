package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.vo.ZhaopingjilibiaoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Zhaopingjihuabiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:56:04
 */
@Mapper
public interface ZhaopingjihuabiaoDao extends BaseMapper<Zhaopingjihuabiao> {
//    @Select("select b.*,zp.*,z.zwmc from bumenbiao b LEFT JOIN zhiweibiao z on b.bmbh=z.bmbh LEFT JOIN zhaopingjihuabiao zp on z.zwbh=zp.zwbh ${ew.customSqlSegment}")
//    IPage<ZhaopingjilibiaoVo> selZpjl(Page<ZhaopingjilibiaoVo> page, @Param(Constants.WRAPPER) QueryWrapper<ZhaopingjilibiaoVo> queryWrapper);

}

