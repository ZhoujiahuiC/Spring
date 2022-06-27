package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Kh;
import com.trkj.hr.vo.KhxxVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久层
@Mapper
public interface KhDao extends BaseMapper<Kh> {
    List<KhxxVo> selectKh0(int khybh);
    List<KhxxVo> selectKh1(int khybh);
    List<KhxxVo> selectKh2(int ybh);
    List<KhxxVo> selectKh3(int ybh);
}
