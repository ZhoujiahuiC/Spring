package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.XingzijilubiaoDao;
import com.trkj.hr.pojo.Xingzijilubiao;
import com.trkj.hr.service.XinzijiluzibiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Xinzijiluzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinzijiluzibiaoService")
public class XinzijiluzibiaoServiceImpl implements XinzijiluzibiaoService {
    @Autowired
    private XingzijilubiaoDao xingzijilubiaoDao;


    @Override
    public IPage<Xingzijilubiao> selectxinzi(int pageNum, int pageSize, int ybh) {
        Page<Xingzijilubiao> page= new Page<>(pageNum,pageSize);
        QueryWrapper<Xingzijilubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("ybh",ybh);
        IPage<Xingzijilubiao> iPage=xingzijilubiaoDao.selectPage(page,queryWrapper);
        return iPage;
    }
}
