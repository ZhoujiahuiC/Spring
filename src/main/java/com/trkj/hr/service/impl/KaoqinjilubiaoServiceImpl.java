package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.ShenhetijiaobiaoDao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.pojo.Kaoqinjilubiao;
import com.trkj.hr.mapper.KaoqinjilubiaoDao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.KaoqinjilubiaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (Kaoqinjilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service
@Slf4j
public class KaoqinjilubiaoServiceImpl implements KaoqinjilubiaoService {
    @Autowired
    private KaoqinjilubiaoDao kaoqinjilubiaoDao;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Autowired
    private ShenhetijiaobiaoDao shenhetijiaobiaoDao;
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

    @Override
    @Scheduled(cron = "0 0 21 * * 1-5 ")//每周1-周5的每天23点执行一次 cron("秒 分 时 月 日 周")
    public int adddingshi() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd");
        String result1 = sdf.format(date);//日期格式化
        List<Yuangongbiao> list = yuangongbiaoDao.selectList(null);//查询所有的员工
        for (Yuangongbiao y:list) {
            QueryWrapper<Kaoqinjilubiao> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("ybh",y.getYbh()).and(q->q.eq("xzsj",result1));//根据员工id循环查询当天未打卡人员
            Kaoqinjilubiao kaoqinjilubiao= kaoqinjilubiaoDao.selectOne(queryWrapper);
            if (kaoqinjilubiao==null){
                Kaoqinjilubiao kaoqinjilubiao1=new Kaoqinjilubiao();
                kaoqinjilubiao1.setYbh(y.getYbh());
                kaoqinjilubiao1.setKqsbdksj(new Date());
                kaoqinjilubiao1.setKqsbzt(5);
                kaoqinjilubiao1.setKqxbdksj(new Date());
                kaoqinjilubiao1.setKqxbzt(5);
                kaoqinjilubiao1.setXzsj(new Date());
                kaoqinjilubiao1.setKqcx(result1+y.getYbh());
                kaoqinjilubiaoDao.insert(kaoqinjilubiao1);
                log.debug("kaoqinjilubiao1:{}",kaoqinjilubiao1);
            }
        }
        return 0;
    }

}
