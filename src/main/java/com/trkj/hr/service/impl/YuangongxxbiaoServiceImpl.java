package com.trkj.hr.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.YuangongxxbiaoDao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.pojo.ygxxbiao;

import com.trkj.hr.service.YuangongxxbiaoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service("YuangongxxbiaoService")
public class YuangongxxbiaoServiceImpl implements YuangongxxbiaoService {
    @Autowired
    private YuangongxxbiaoDao yuangongxxbiaoDao;
    //根据id查询个人信息
    @Override
    public List<ygxxbiao> selctyuangongbiao(int ybh) {
        return yuangongxxbiaoDao.selctyuangongbiao(ybh);
    }
    //分页查询员工信息可根据name模糊查询
    @Override
    public IPage<ygxxbiao> selctyuangongguanli(int pageNum, int pageSize,String rzname) {
        Page<ygxxbiao> page= new Page<>(pageNum,pageSize);
        QueryWrapper<ygxxbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.rzname","%"+rzname+"%");
        IPage<ygxxbiao> iPage=yuangongxxbiaoDao.selctyuangongguanli(page,queryWrapper);
        return iPage;
    }
    //根据员工状态查询
    @Override
    public IPage<ygxxbiao> selectygzt(int pageNum, int pageSize, int ygzt) {
        Page<ygxxbiao> page= new Page<>(pageNum,pageSize);
        QueryWrapper<ygxxbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("ygzt",ygzt);
        IPage<ygxxbiao> iPage=yuangongxxbiaoDao.selectygzt(page,queryWrapper);
        return iPage;
    }


}
