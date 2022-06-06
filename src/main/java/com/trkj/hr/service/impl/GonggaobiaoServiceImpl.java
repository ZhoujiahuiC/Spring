package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Gonggaobiao;
import com.trkj.hr.mapper.GonggaobiaoDao;
import com.trkj.hr.service.GonggaobiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Gonggaobiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("gonggaobiaoService")
public class GonggaobiaoServiceImpl implements GonggaobiaoService {
    @Autowired
    private GonggaobiaoDao gonggaobiaoDao;
    //添加公告
    @Override
    public int addgg(Gonggaobiao gonggaobiao) {
        return gonggaobiaoDao.insert(gonggaobiao);
    }
    //分页查询公告
    @Override
    public IPage<Gonggaobiao> selectgg(int pageNum, int pageSize) {
        Page<Gonggaobiao> page=new Page(pageNum,pageSize);
        QueryWrapper<Gonggaobiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("ggbh");
        IPage<Gonggaobiao> iPage=gonggaobiaoDao.selectPage(page,queryWrapper);
        return iPage;
    }
}
