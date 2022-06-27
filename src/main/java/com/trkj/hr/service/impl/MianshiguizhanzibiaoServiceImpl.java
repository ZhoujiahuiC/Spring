package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.mapper.ZhiweibiaoDao;
import com.trkj.hr.pojo.Mianshiguizhanzibiao;
import com.trkj.hr.mapper.MianshiguizhanzibiaoDao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.service.MianshiguizhanzibiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Mianshiguizhanzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("mianshiguizhanzibiaoService")
public class MianshiguizhanzibiaoServiceImpl implements MianshiguizhanzibiaoService {

    @Autowired
    private MianshiguizhanzibiaoDao mianshiguizhanzibiaoDao;
    @Override
    public int addMsgzz(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        int i=0;
        QueryWrapper<Mianshiguizhanzibiao> mianshiguizhanzibiaoQueryWrapper=new QueryWrapper<>();
        mianshiguizhanzibiaoQueryWrapper.eq("mbh",mianshiguizhanzibiao.getMbh());
        List<Mianshiguizhanzibiao> mianshiguizhanzibiaos = mianshiguizhanzibiaoDao.selectList(mianshiguizhanzibiaoQueryWrapper);
        if(mianshiguizhanzibiaos.size()<3){
            i=mianshiguizhanzibiaoDao.insert(mianshiguizhanzibiao);

        }

        return i;

    }

    @Override
    public int updateMsgzz(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        int i = mianshiguizhanzibiaoDao.updateById(mianshiguizhanzibiao);
        return i;
    }

    @Override
    public int delMsgzz(int mzbh) {
        int i = mianshiguizhanzibiaoDao.deleteById(mzbh);
        return i;
    }
}
