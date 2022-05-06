package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Xingzijilubiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Xingzijilubiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:43
 */
@Mapper
public interface XingzijilubiaoDao extends BaseMapper<Xingzijilubiao> {


}

