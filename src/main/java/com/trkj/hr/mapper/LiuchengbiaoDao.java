package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.vo.LiuchengxxVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久层
@Mapper
public interface LiuchengbiaoDao extends BaseMapper<Liuchengbiao> {
    //流程详情
    public List<LiuchengxxVo> selectxx(int workid);
}
