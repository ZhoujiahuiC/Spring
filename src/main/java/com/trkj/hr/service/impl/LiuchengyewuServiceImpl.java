package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.LiuchengjiedianbiaoDao;
import com.trkj.hr.mapper.LiuchengyewuDao;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.pojo.Liuchengyewu;
import com.trkj.hr.service.LiuchengyewuService;
import com.trkj.hr.vo.LiuchengywxxVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("liuchengyewuService")
@Slf4j
public class LiuchengyewuServiceImpl implements LiuchengyewuService {
    int a = 0;
    int b = 0;
    @Autowired
    private LiuchengyewuDao liuchengyewuDao;
    @Resource
    private LiuchengjiedianbiaoDao liuchengjiedianbiaoDao;
    @Override
    public List<LiuchengywxxVo> selectyewuxx(Integer ybh) {
        return liuchengyewuDao.selectyewuxx(ybh);
    }

    @Override
    public List<Object> selectObjsyw() {
        QueryWrapper<Liuchengyewu> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("yewuid").last("limit 1");
        return liuchengyewuDao.selectObjs(queryWrapper);
    }

    @Override
    public int insertyw(Liuchengyewu liuchengyewu) {
        return liuchengyewuDao.insert(liuchengyewu);
    }

    @Override
    public Integer selectcountyw(Integer businessid,Integer workid) {

        QueryWrapper<Liuchengyewu> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("businessid",businessid);
        a = liuchengyewuDao.selectCount(queryWrapper);

        QueryWrapper<Liuchengjiedianbiao> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.eq("workid",workid);
        b = liuchengjiedianbiaoDao.selectCount(queryWrapper1);
        System.out.println("================================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println("================================================");
        return a;
    }


}
