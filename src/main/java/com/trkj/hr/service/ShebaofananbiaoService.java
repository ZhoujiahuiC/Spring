package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Jixiaodinjibiao;
import com.trkj.hr.pojo.Shebaofananbiao;
import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.vo.ShebaofananVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * (Shebaofananbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShebaofananbiaoService  {
    //查询社保方案
    List<Shebaofananbiao> selectAll();
//    分页查询
    IPage<Shebaofananbiao> page(int pageNum,int pageSize);
//    添加社保方案
    int addSb(Shebaofananbiao shebaofananbiao);
//    删除单个社保方案
    int deleteById(int sbbh);
//    批量删除
    int BatchDel(List<Integer> ids);
//    根据社保方案名称查询
    IPage<Shebaofananbiao> selectlike(int pageNum,int pageSize,String name);
//    添加社保方案2
    int addSbfan(Shebaofananbiao shebaofananbiao);
    //查询社保方案详情mybatils-puls
    Shebaofananbiao selSbxq1(int sbbh);
//    修改社保方案
    int upShebao(Shebaofananbiao shebaofananbiao);
}
