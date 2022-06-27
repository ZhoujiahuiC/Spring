package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.KhDao;
import com.trkj.hr.pojo.Kh;
import com.trkj.hr.service.KhService;
import com.trkj.hr.vo.KhxxVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("KhService")
@Slf4j
public class KhServiceImpl implements KhService {
    @Autowired
    private KhDao khDao;
    @Override
    public List<KhxxVo> selectKh0(int khybh) {
        return khDao.selectKh0(khybh);
    }

    @Override
    public List<Object> selectObjskh() {
        QueryWrapper<Kh> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("khid").last("limit 1");
        return khDao.selectObjs(queryWrapper);
    }

    @Override
    public int insertxxkh(Kh kh) {
        log.debug(String.valueOf(khDao.insert(kh)));
        return khDao.insert(kh);
    }

    @Override
    public int updatakh(Kh kh) {
        return khDao.updateById(kh);
    }

    @Override
    public List<KhxxVo> selectKh1(int khybh) {
        return khDao.selectKh1(khybh);
    }

    @Override
    public List<KhxxVo> selectKh2(int ybh) {
        return khDao.selectKh2(ybh);
    }

    @Override
    public List<KhxxVo> selectKh3(int ybh) {
        return khDao.selectKh3(ybh);
    }

    @Override
    public List<Kh> selectkh4(int khid) {
        QueryWrapper <Kh> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("khid",khid);
        return khDao.selectList(queryWrapper);
    }
}
