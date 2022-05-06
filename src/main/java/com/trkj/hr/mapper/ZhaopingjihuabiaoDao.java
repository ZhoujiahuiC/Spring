package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Zhaopingjihuabiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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


}

