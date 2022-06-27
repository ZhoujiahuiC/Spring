package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.pojo.Sbzjb;
import com.trkj.hr.mapper.SbzjbDao;
import com.trkj.hr.service.SbzjbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sbzjb)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("sbzjbService")
public class SbzjbServiceImpl implements SbzjbService {
   @Autowired
    private SbzjbDao sbzjbDao;

    @Override
    public List<Sbzjb> selectAll(Integer sbbh) {
        return sbzjbDao.selectSbjs(sbbh);
    }
    //通过社保方案编号修改社保项目





}
