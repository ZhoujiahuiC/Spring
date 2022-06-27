package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.KhmbxxDao;
import com.trkj.hr.pojo.Khmbxx;
import com.trkj.hr.service.KhmbxxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("KhmbxxService")
@Slf4j
public class KhmbxxServiceImpl implements KhmbxxService {
    @Autowired
    private KhmbxxDao khmbxxDao;
    @Override
    public List<Khmbxx> khmbxxs(int khmbid) {
        QueryWrapper<Khmbxx> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("khmbid",khmbid);
        return khmbxxDao.selectList(queryWrapper);
    }

    @Override
    public List<Object> khmbxxObjs() {
        QueryWrapper<Khmbxx> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("khmbxid").last("limit 1");
        return khmbxxDao.selectObjs(queryWrapper);
    }

    @Override
    public boolean insertkhmbxxs(Khmbxx khmbxx) {
        return khmbxxDao.insert(khmbxx)==1?true:false;
    }

    @Override
    public int deletekhmbxxs(Integer khmbid) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("khmbid",khmbid);
        return khmbxxDao.delete(wrapper);
    }

    @Override
    public List<Khmbxx> selectxxkhmbxx() {
        return khmbxxDao.selectList(null);
    }
}
