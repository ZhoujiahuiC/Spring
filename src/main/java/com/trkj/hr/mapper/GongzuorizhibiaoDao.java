package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Gongzuorizhibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Gongzuorizhibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:40
 */
@Mapper
public interface GongzuorizhibiaoDao extends BaseMapper<Gongzuorizhibiao> {


}

