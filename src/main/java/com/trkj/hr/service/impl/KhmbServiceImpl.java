package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.KhmbDao;
import com.trkj.hr.pojo.Khmb;
import com.trkj.hr.service.KhmbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("KhmbService")
@Slf4j
public class KhmbServiceImpl implements KhmbService {
    @Autowired
    private KhmbDao khmbDao;
    @Override
    public List<Khmb> khmns() {
        return khmbDao.selectList(null);
    }

    @Override
    public List<Object> khmbObjs() {
        QueryWrapper<Khmb> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("khmbid").last("limit 1");
        return khmbDao.selectObjs(queryWrapper);
    }

    @Override
    public int insertkhmb(Khmb khmb) {
        return khmbDao.insert(khmb);
    }

    @Override
    public int deletekhmb(Integer khmbid) {
        return khmbDao.deleteById(khmbid);
    }
}
