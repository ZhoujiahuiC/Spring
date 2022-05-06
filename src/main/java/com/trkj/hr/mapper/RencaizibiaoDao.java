package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Rencaizibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Rencaizibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:49
 */
@Mapper
public interface RencaizibiaoDao extends BaseMapper<Rencaizibiao> {



}

