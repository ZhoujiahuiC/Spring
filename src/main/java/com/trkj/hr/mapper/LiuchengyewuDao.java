package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Liuchengyewu;
import com.trkj.hr.vo.LiuchengywxxVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久层
@Mapper
public interface LiuchengyewuDao extends BaseMapper<Liuchengyewu> {
    List<LiuchengywxxVo> selectyewuxx(Integer ybh);
}
