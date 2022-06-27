package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.ShenhetijiaobiaoDao;
import com.trkj.hr.pojo.Shenhetijiaobiao;
import com.trkj.hr.service.ShenhetijiaobiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Shenhejilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service
public class ShenhetijiaobiaoServicelmpl implements ShenhetijiaobiaoService {
    @Autowired
    private ShenhetijiaobiaoDao shenhetijiaobiaoDao;
    @Override
    public int inserttianjia(Shenhetijiaobiao shenhetijiaobiao) {
        return shenhetijiaobiaoDao.insert(shenhetijiaobiao);
    }

    @Override
    public List<Shenhetijiaobiao> selectyewu(int businessid) {
        QueryWrapper<Shenhetijiaobiao> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("businessid",businessid);
        return shenhetijiaobiaoDao.selectList(queryWrapper);
    }
}
