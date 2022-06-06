package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.YgcanbaoDao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YgcanbaoService;
import com.trkj.hr.vo.YgcanbaoVo;
import com.trkj.hr.vo.YuangonVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service("YgcanbaoService")
public class YgcanbaoServiceImpl implements YgcanbaoService {
    @Resource
    private YgcanbaoDao ygcanbaoDao;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Override
    public List<YgcanbaoVo> selOneYgcb(int ybh) {
        return ygcanbaoDao.selOneYgcb(ybh);
    }
    @Override
    public IPage<YgcanbaoVo> selPageAllEmpSb(int pageNum, int pageSize, String rzname, String sbmc) {
        Page<YgcanbaoVo> page=new Page<>(pageNum,pageSize);
        QueryWrapper<YuangonVo> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.rzname",rzname).like("d.sbmc",sbmc);
        queryWrapper.eq("iscb",1).eq("ygzt",1);
        IPage<YgcanbaoVo> iPage=ygcanbaoDao.selPageAllEmpSb(page,queryWrapper);
        log.debug("ipage:{}", CollectionUtils.isEmpty(iPage.getRecords()));
        return iPage;
    }

    @Override
    public int updateIscb(List<Yuangongbiao> voList) {
        for (Yuangongbiao y: voList) {
            y.setIscb(0);
            log.debug("y:{}",y);
            int i = yuangongbiaoDao.updateById(y);
        }
        return 1;
    }



    @Override
    public List<YgcanbaoVo> nocbyg() {
        return ygcanbaoDao.nocbyg();
    }

    @Override
    public int upEmpcb(List<Integer> voList) {
        for (int i: voList) {
            log.debug("yuangongbiao:{}",i);
            Yuangongbiao yuangongbiao = new Yuangongbiao();
            yuangongbiao.setYbh(i);
            yuangongbiao.setIscb(1);
            int count = yuangongbiaoDao.updateById(yuangongbiao);
        }
        return 1;
    }




}
