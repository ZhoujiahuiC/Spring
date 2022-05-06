package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Bancibiao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Bancibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:47
 */
@Mapper
public interface BancibiaoDao extends BaseMapper<Bancibiao> {


}

