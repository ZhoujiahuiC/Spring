package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.BumenbiaoDao;
import com.trkj.hr.mapper.JibengongzibiaoDao;
import com.trkj.hr.mapper.XinzijibengongzibiaoDao;
import com.trkj.hr.mapper.XinziyaosuxiangbiaoDao;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.service.XinzijibengongzibiaoService;

import com.trkj.hr.vo.BumenJbgzb;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Xinzijibengongzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinzijibengongzibiaoService")
@Slf4j
public class XinzijibengongzibiaoServiceImpl implements XinzijibengongzibiaoService {

    @Resource
    private XinzijibengongzibiaoDao xinzijibengongzibiaoDao;
    @Autowired
    private JibengongzibiaoDao jibengongzibiaoDao;
    @Override
    public IPage<BumenJbgzb> selAllOfjbgz(Integer pageNum, Integer pageSize, String bmmc, String zwmc) {
        Page<BumenJbgzb> page=new Page<>(pageNum,pageSize);
        QueryWrapper<BumenJbgzb> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.bmmc",bmmc).like("z.zwmc",zwmc);
        IPage<BumenJbgzb> bumenbiaoIPage = xinzijibengongzibiaoDao.selPageOfjbgz(page, queryWrapper);
        return bumenbiaoIPage;
    }
    //    修改基本工资
    @Override
    public int upjbxz( Xinzijibengongzibiao xinzijibengongzibiao) {
        return jibengongzibiaoDao.updateById(xinzijibengongzibiao);
    }
    //    添加基本工资
    @Override
    public int addjbxz(int zwbh,Double xzjbxz) {
        Xinzijibengongzibiao xinzijibengongzibiao = new Xinzijibengongzibiao();
        xinzijibengongzibiao.setZwbh(zwbh);
        xinzijibengongzibiao.setXzjbgz(xzjbxz);
        return jibengongzibiaoDao.insert(xinzijibengongzibiao);
    }


}
