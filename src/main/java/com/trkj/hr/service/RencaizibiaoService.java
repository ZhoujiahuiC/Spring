package com.trkj.hr.service;

import com.trkj.hr.pojo.Rencaizibiao;

import java.util.List;

/**
 * (Rencaizibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface RencaizibiaoService {
    //统计男女人数
    List<Rencaizibiao> tjnv();
    //修改信息
    int updaterenzi (Rencaizibiao rencaizibiao);
}
