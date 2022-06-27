package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.vo.JiedianxxVo;
import com.trkj.hr.vo.LiuchengxxVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久层
@Mapper
public interface LiuchengjiedianbiaoDao extends BaseMapper<Liuchengjiedianbiao> {
    public List<JiedianxxVo> jiedianxx(int workid);
}
