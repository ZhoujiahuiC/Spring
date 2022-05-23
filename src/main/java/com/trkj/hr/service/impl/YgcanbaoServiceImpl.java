package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.YgcanbaoDao;
import com.trkj.hr.service.YgcanbaoService;
import com.trkj.hr.vo.YgcanbaoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("YgcanbaoService")
public class YgcanbaoServiceImpl implements YgcanbaoService {
    @Resource
    private YgcanbaoDao ygcanbaoDao;
    @Override
    public List<YgcanbaoVo> selOneYgcb(int ybh) {
        return ygcanbaoDao.selOneYgcb(ybh);
    }
}
