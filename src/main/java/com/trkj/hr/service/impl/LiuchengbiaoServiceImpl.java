package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.LiuchengbiaoDao;
import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.service.LiuchengbiaoService;
import com.trkj.hr.vo.LiuchengxxVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("liuchengbiaoService")
@Slf4j
public class LiuchengbiaoServiceImpl implements LiuchengbiaoService {
    @Autowired
    private LiuchengbiaoDao liuchengbiaoDao;
    @Override
    public List<Liuchengbiao> liuchengbiaos(){
        return liuchengbiaoDao.selectList(null);
    }

    @Override
    public int updateworkzt(Liuchengbiao liuchengbiao) {
        return liuchengbiaoDao.updateById(liuchengbiao);
    }

    @Override
    public List<LiuchengxxVo> selectxx(int workid) {
        return liuchengbiaoDao.selectxx(workid);
    }

    @Override
    public List<Liuchengbiao> selectliu(String workname){
        QueryWrapper<Liuchengbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("workname",workname);
        return liuchengbiaoDao.selectList(queryWrapper);
    }

    @Override
    public int deleteById(int workid){
        return liuchengbiaoDao.deleteById(workid);
    }


}
