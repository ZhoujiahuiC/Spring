package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.pojo.Kaoqinjilubiao;
import com.trkj.hr.mapper.KaoqinjilubiaoDao;
import com.trkj.hr.pojo.ygxxbiao;
import com.trkj.hr.service.KaoqinjilubiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * (Kaoqinjilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service
public class KaoqinjilubiaoServiceImpl implements KaoqinjilubiaoService {
    @Autowired
    private KaoqinjilubiaoDao kaoqinjilubiaoDao;
    //添加上班打卡记录
    @Override
    public int addkq( Kaoqinjilubiao kaoqinjilubiao) {

        return kaoqinjilubiaoDao.insert(kaoqinjilubiao);
    }
    //根据当前的特殊字段查询
    @Override
    public Kaoqinjilubiao selectkaoqin(String s) {
        QueryWrapper<Kaoqinjilubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("kqcx",s);
        Kaoqinjilubiao kaoqinjilubiao = kaoqinjilubiaoDao.selectOne(queryWrapper);
        return kaoqinjilubiao;
    }
    //提前下班打卡修改
    @Override
    public int updatekq(String kqcx) {
        QueryWrapper<Kaoqinjilubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("kqcx",kqcx);
        Date date=new Date();
        Kaoqinjilubiao kaoqinjilubiao=new Kaoqinjilubiao();
        kaoqinjilubiao.setKqxbdksj(date);
        kaoqinjilubiao.setKqxbzt(4);
        kaoqinjilubiao.setXzsj(date);
        int update = kaoqinjilubiaoDao.update(kaoqinjilubiao, queryWrapper);
        return update;
    }
    //正常下班打卡修改
    @Override
    public int updatekq1(String kqcx) {
        QueryWrapper<Kaoqinjilubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("kqcx",kqcx);
        Date date=new Date();
        Kaoqinjilubiao kaoqinjilubiao=new Kaoqinjilubiao();
        kaoqinjilubiao.setKqxbdksj(date);
        kaoqinjilubiao.setKqxbzt(2);
        kaoqinjilubiao.setXzsj(date);
        int update = kaoqinjilubiaoDao.update(kaoqinjilubiao, queryWrapper);
        return update;
    }

    //根据ybh查询员工的考勤记录
    @Override
    public List<Kaoqinjilubiao> selectkq(int ybh) {
        QueryWrapper<Kaoqinjilubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("ybh",ybh);
        return kaoqinjilubiaoDao.selectList(queryWrapper);
    }

}
