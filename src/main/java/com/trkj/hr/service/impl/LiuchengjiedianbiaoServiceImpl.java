package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.LiuchengjiedianbiaoDao;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.service.LiuchengjiedianbiaoService;
import com.trkj.hr.vo.JiedianxxVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("liuchengjiedianbiaoService")
@Slf4j
public class LiuchengjiedianbiaoServiceImpl implements LiuchengjiedianbiaoService {
    @Autowired
    private LiuchengjiedianbiaoDao liuchengjiedianbiaoDao;
    @Override
    public List<JiedianxxVo> jiedianxx(int workid) {
        return liuchengjiedianbiaoDao.jiedianxx(workid);
    }

    @Override
    public int updataxx(Liuchengjiedianbiao liuchengjiedianbiao) {
        return liuchengjiedianbiaoDao.updateById(liuchengjiedianbiao);
    }

    @Override
    public int deletexx(Integer nodeid) {
        return liuchengjiedianbiaoDao.deleteById(nodeid);
    }

    @Override
    public List<Object> selectjieObjs() {
        QueryWrapper<Liuchengjiedianbiao> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("nodeid").last("limit 1");
        return liuchengjiedianbiaoDao.selectObjs(queryWrapper);
    }

    @Override
    public int insertxx(Liuchengjiedianbiao liuchengjiedianbiao) {
        return liuchengjiedianbiaoDao.insert(liuchengjiedianbiao);
    }

    @Override
    public Boolean insertxx2(Liuchengjiedianbiao liuchengjiedianbiao) {
        return liuchengjiedianbiaoDao.insert(liuchengjiedianbiao)==1?true:false;
    }

    @Override
    public Integer selectcountjie(Integer workid) {
        QueryWrapper<Liuchengjiedianbiao> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("workid",workid);
        return liuchengjiedianbiaoDao.selectCount(queryWrapper);
    }


}
