package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.BancibiaoDao;
import com.trkj.hr.pojo.Bancibiao;
import com.trkj.hr.service.BancibiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("BancibiaoService")
public class BancibiaoServiceImpl implements BancibiaoService {
    @Autowired
    private BancibiaoDao bancibiaoDao;
    @Override
    public List<Bancibiao> selBc() {
        List<Bancibiao> bancibiaos = bancibiaoDao.selectList(null);
        return bancibiaos;
    }

    @Override
    public int intBc(Bancibiao bancibiao) {
        return bancibiaoDao.insert(bancibiao);
    }

    @Override
    public int upBc(Bancibiao bancibiao) {
        return bancibiaoDao.updateById(bancibiao);
    }

    @Override
    public int delBc(int bcbh) {
        return bancibiaoDao.deleteById(bcbh);
    }
}
