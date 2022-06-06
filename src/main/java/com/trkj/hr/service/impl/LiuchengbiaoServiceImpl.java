package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.LiuchengbiaoDao;
import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.service.LiuchengbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("liuchengbiaoService")
public class LiuchengbiaoServiceImpl implements LiuchengbiaoService {
    @Autowired
    private LiuchengbiaoDao liuchengbiaoDao;
    @Override
    public List<Liuchengbiao> liuchengbiaos(){
        return liuchengbiaoDao.selectList(null);
    }

    @Override
    public int updateworkzt(Liuchengbiao liuchengbiao) {
        return liuchengbiaoDao.updateById(liuchengbiao);
    }
}
