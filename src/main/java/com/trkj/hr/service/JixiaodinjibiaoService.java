package com.trkj.hr.service;

import com.trkj.hr.pojo.Jixiaodinjibiao;

import com.trkj.hr.pojo.Yuangongbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * (Jixiaodinjibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JixiaodinjibiaoService {
    //绩效定级添加方法
    int addJixiaodinji(Jixiaodinjibiao jixiaodinjibiao);
    //绩效定级查询方法
    List<Jixiaodinjibiao> selectAllJixiao();
    //绩效定级修改方法
    int updateJixiaodinji(Jixiaodinjibiao jixiaodinjibiao);
    //绩效定级删除多个方法
    int deleteJixiao(List<Integer> ids);
    //绩效定级删除单个
    int deleteOne(int jdbh);


}
