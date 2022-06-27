package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.*;
import com.trkj.hr.pojo.*;
import com.trkj.hr.service.XzdaService;
import com.trkj.hr.vo.BumenJbgzb;
import com.trkj.hr.vo.XzdaVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service("XzdaService")
@Slf4j
public class XzdaServiceImpl implements XzdaService {
    @Resource
    private XzdaDao xzdaDao;
    @Autowired
    private BumenbiaoDao bumenbiaoDao;
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Autowired
    private ZhiweibiaoDao zhiweibiaoDao;
    @Autowired
    private XinzijibengongzibiaoDao xinzijibengongzibiaoDao;
    @Override
    public IPage<XzdaVo> selPageAll(int pageNum, int pageSize, String rzname, String  bmmc,String  ygzt) {
        if (!rzname.equals("")&!bmmc.equals("")) {
        QueryWrapper<Rencaizibiao> rencaizibiaobiaoQueryWrapper=new QueryWrapper<>();
        rencaizibiaobiaoQueryWrapper.eq("rzname",rzname);
        Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaobiaoQueryWrapper);
        log.debug("rencaizibiao:{}",rencaizibiao);
        QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
        yuangongbiaoQueryWrapper.eq("rzbh",rencaizibiao.getRzbh());
        Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
        log.debug("yuangongbiao:{}",yuangongbiao);
        QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
        zhiweibiaoQueryWrapper.eq("zwbh",yuangongbiao.getZwbh());
        Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
        log.debug("zhiweibiao:{}",zhiweibiao);
        QueryWrapper<Xinzijibengongzibiao> xinzijibengongzibiaoQueryWrapper=new QueryWrapper<>();
        xinzijibengongzibiaoQueryWrapper.eq("zwbh",zhiweibiao.getZwbh());
        Xinzijibengongzibiao xinzijibengongzibiao= xinzijibengongzibiaoDao.selectXinzi(xinzijibengongzibiaoQueryWrapper);
        if(xinzijibengongzibiao.getXzjbgz()==yuangongbiao.getXzjbgz()){
            Yuangongbiao yg=yuangongbiao;
            yg.setXzjbgz(xinzijibengongzibiao.getXzjbgz());
            log.debug("yg:{}",yg);
            int i = yuangongbiaoDao.updateById(yg);
        }
        }
        Page<XzdaVo> page=new Page<>(pageNum,pageSize);
        QueryWrapper<XzdaVo> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("r.rzname",rzname).like("b.bmmc",bmmc).like("y.ygzt",ygzt);
        queryWrapper.in("y.ygzt", 1,2,3);
        IPage<XzdaVo> iPage=xzdaDao.selPageAll(page,queryWrapper);

        return iPage;
    }
}
