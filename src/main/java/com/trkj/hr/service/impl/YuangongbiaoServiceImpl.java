package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.service.YuangongbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * (Yuangongbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("yuangongbiaoService")
public class YuangongbiaoServiceImpl implements YuangongbiaoService {
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Override
    public boolean selectYg(String yzh, String ymm) {
        if(!yzh.equals(null)&!ymm.equals(null)){
            QueryWrapper<Yuangongbiao> queryWrapper=new QueryWrapper();
            queryWrapper.eq("yzh",yzh)
                    .and(mm->mm.eq("ymm",ymm))
                    ;
            int count=yuangongbiaoDao.selectCount(queryWrapper);
            if(count>0){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
