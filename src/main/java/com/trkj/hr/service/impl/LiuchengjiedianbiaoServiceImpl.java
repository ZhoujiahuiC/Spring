package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.LiuchengjiedianbiaoDao;
import com.trkj.hr.service.LiuchengjiedianbiaoService;
import com.trkj.hr.vo.JiedianxxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("liuchengjiedianbiaoService")
public class LiuchengjiedianbiaoServiceImpl implements LiuchengjiedianbiaoService {
    @Autowired
    private LiuchengjiedianbiaoDao liuchengjiedianbiaoDao;
    @Override
    public List<JiedianxxVo> jiedianxx(int workid) {
        return liuchengjiedianbiaoDao.jiedianxx(workid);
    }


}
