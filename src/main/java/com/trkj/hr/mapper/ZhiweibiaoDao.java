package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Zhiweibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Zhiweibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:47
 */
@Mapper
public interface ZhiweibiaoDao extends BaseMapper<Zhiweibiao> {

    @Select("SELECT * from zhiweibiao  WHERE bmbh=#{bmbh}")
    List<Zhiweibiao> selBatchbyid(int bmbh);
}

