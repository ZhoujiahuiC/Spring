package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Bancibiao;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.vo.BumenJbgzb;
import com.trkj.hr.vo.YgcanbaoVo;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Xinzijibengongzibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:42
 */
@Mapper
@Repository
public interface XinzijibengongzibiaoDao extends BaseMapper<BumenJbgzb> {
    //    分页条件查询所有部门职位的基本工资
    @Select("SELECT * FROM xinzijibengongzibiao x LEFT JOIN zhiweibiao z on x.zwbh=z.zwbh LEFT JOIN bumenbiao b on z.bmbh=b.bmbh ${ew.customSqlSegment} ")
    IPage<BumenJbgzb> selPageOfjbgz (Page<BumenJbgzb> page, @Param(Constants.WRAPPER) QueryWrapper<BumenJbgzb> queryWrapper);
    @Select("select * from xinzijibengongzibiao ${ew.customSqlSegment}")
    Xinzijibengongzibiao selectXinzi(@Param(Constants.WRAPPER) QueryWrapper<Xinzijibengongzibiao> queryWrapper);
    @Select("SELECT b.bmbh,b.bmmc,z.zwmc,z.zwjs,z.zwsj,x.zwbh,x.xzjbbh,x.shbid,x.shjlbh,x.xzjbgz from xinzijibengongzibiao x LEFT JOIN zhiweibiao z on x.zwbh=z.zwbh\n" +
            "LEFT JOIN bumenbiao b on z.bmbh= b.bmbh where b.bmbh =#{bmbh}")
    List<BumenJbgzb> selzwxz(@Param("bmbh") int bmbh);
}

