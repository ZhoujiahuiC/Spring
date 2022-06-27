package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.KhzDao;
import com.trkj.hr.pojo.Khz;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.service.KhzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("KhzService")
@Slf4j
public class KhzServiceImpl implements KhzService {
    @Autowired
    public KhzDao khzDao;

    @Override
    public boolean insertkhzs(Khz khz) {
        return khzDao.insert(khz)==1?true : false;
    }

    @Override
    public List<Object> khzObjs() {
        QueryWrapper<Khz> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("zkhid").last("limit 1");
        return khzDao.selectObjs(queryWrapper);
    }

    @Override
    public int updatakhz(List<Khz> formData) {
        int i=0;
        for (Khz s : formData){
            if (khzDao.updateById(s)>0){
                i++;
            }
        }
        return i;
    }

    @Override
    public List<Khz> khzxxs(int khid) {
        QueryWrapper<Khz> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("khid",khid);
        return khzDao.selectList(queryWrapper);
    }

}
