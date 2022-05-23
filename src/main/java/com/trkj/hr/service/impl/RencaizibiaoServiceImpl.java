package com.trkj.hr.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.trkj.hr.mapper.RencaizibiaoDao;
import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.service.RencaizibiaoService;
import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * (Rencaizibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("rencaizibiaoService")
public class RencaizibiaoServiceImpl implements RencaizibiaoService {
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    //统计男女人数
    @Override
    public List<Rencaizibiao> tjnv() {
        return rencaizibiaoDao.tjnv();
    }
    //修改信息
    @Override
    public int updaterenzi(Rencaizibiao rencaizibiao) {
        return rencaizibiaoDao.updateById(rencaizibiao);
    }


}
