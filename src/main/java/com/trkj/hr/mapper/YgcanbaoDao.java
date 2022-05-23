package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.vo.YgcanbaoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YgcanbaoDao extends BaseMapper<YgcanbaoVo> {
    @Select("SELECT y.ybh,y.ygrzrq,y.ygzt,r.rzname,r.rzsex, s.sbmc,js.sbjsje,js.sbname,z.zwmc\n" +
            "from yuangongbiao y \n" +
            "LEFT JOIN rencaizibiao r on y.rzbh=r.rzbh\n" +
            "LEFT JOIN zhiweibiao z ON y.zwbh=z.zwbh \n" +
            "LEFT JOIN shebaofananbiao s on y.sbbh=s.sbbh\n" +
            "LEFT JOIN sbzjb zjb on  s.sbbh=zjb.sbbh\n" +
            "LEFT JOIN shebaojishubiao js on js.sbjsbh=zjb.sbjsbh where y.ybh=#{ybh}")
    List<YgcanbaoVo> selOneYgcb(int ybh);

}
