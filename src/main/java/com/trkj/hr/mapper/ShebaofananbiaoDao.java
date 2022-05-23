package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Shebaofananbiao;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * (Shebaofananbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:48
 */
@Mapper
@Repository
public interface ShebaofananbiaoDao extends BaseMapper<Shebaofananbiao> {
//    根据id删除社保方案
    @Delete("delete from shebaofananbiao where sbbh=${sbbh}")
    int delectbyid(@Param("sbbh") int sbbh);
//    @Select("select fab.sbbh,fab.sbmc,fab.isuse,jsb.* from shebaofananbiao fab INNER JOIN sbzjb zjb on fab.sbbh=zjb.sbbh INNER JOIN shebaojishubiao jsb on jsb.sbjsbh= zjb.sbjsbh where fab.sbbh=${sbbh}")
////    查询社保方案详情
//    Shebaofananbiao selSbxq(Integer sbbh);

}

