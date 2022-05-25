package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Chuchaibiao;
import com.trkj.hr.mapper.ChuchaibiaoDao;
import com.trkj.hr.service.ChuchaibiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * (Chuchaibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("chuchaibiaoService")
public class ChuchaibiaoServiceImpl implements ChuchaibiaoService {
    @Autowired
    private ChuchaibiaoDao chuchaibiaoDao;
    //根据分页查询该员工的出差记录
    @Override
    public IPage<Chuchaibiao> selectchuchai(int pageNum, int pageSize, int ybh) {
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<Chuchaibiao> page= new Page<>(pageNum,pageSize);
        QueryWrapper<Chuchaibiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("ybh",ybh);
        IPage<Chuchaibiao> iPage=chuchaibiaoDao.selectPage(page,queryWrapper);
        return iPage;
    }
}
