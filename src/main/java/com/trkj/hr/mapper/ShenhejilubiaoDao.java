package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Shenhejilubiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Shenhejilubiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:45
 */
@Mapper
public interface ShenhejilubiaoDao extends BaseMapper<Shenhejilubiao> {



}

