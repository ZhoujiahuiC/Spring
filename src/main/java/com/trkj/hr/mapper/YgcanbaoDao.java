package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.vo.YgcanbaoVo;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YgcanbaoDao extends BaseMapper<YgcanbaoVo> {
    //    查询参保人员详情
    @Select("SELECT  y.ybh ,sbjsb.sbname,sbjsb.sbjnbl,empzjb.empjs,sbjsb.sbjsje,sbfa.sbbh from yuangongbiao y \n" +
            "LEFT JOIN shebaofananbiao sbfa on y.sbbh=sbfa.sbbh LEFT JOIN sbzjb sbzjb on sbzjb.sbbh=sbfa.sbbh\n" +
            "LEFT JOIN shebaojishubiao sbjsb on sbzjb.sbjsbh=sbjsb.sbjsbh \n" +
            "LEFT JOIN empjszjb empzjb on y.ybh=empzjb.ybh and empzjb.sbjsbh=sbjsb.sbjsbh  where y.ybh=#{ybh}")
    List<YgcanbaoVo> selOneYgcb(int ybh);

    //    查询参保人员
    @Select("select a.*,b.*,d.sbmc,e.zwmc,f.bmmc\n" +
            "from yuangongbiao as a inner join Rencaizibiao as b  inner join shebaofananbiao as d inner join zhiweibiao as e inner join bumenbiao as f\n" +
            "on a.rzbh= b.rzbh  and a.sbbh=d.sbbh and a.zwbh= e.zwbh and e.bmbh=f.bmbh ${ew.customSqlSegment} ")
    IPage<YgcanbaoVo> selPageAllEmpSb(Page<YgcanbaoVo> page, @Param(Constants.WRAPPER) QueryWrapper<YuangonVo> queryWrapper);

    //查询未参保人员
    @Select("SELECT  * from yuangongbiao y\n" +
            " LEFT JOIN rencaizibiao r on y.ybh=r.rzbh  where y.iscb=0")
    List<YgcanbaoVo> nocbyg();

//    添加员工参保
//    @Update("update yuangongbiao y set y.iscb=1 where y.ybh=#{ybh} ")
//    int upEmpcb(List<> voList);

}
