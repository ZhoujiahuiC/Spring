package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.mapper.ZhiweibiaoDao;
import com.trkj.hr.service.ZhiweibiaoService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Zhiweibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("zhiweibiaoService")
public class ZhiweibiaoServiceImpl implements ZhiweibiaoService {
    @Resource
    private ZhiweibiaoDao zhiweibiaoDao;
    @Override
    public List<Zhiweibiao> selectBatchById(int bmbh) {
        return zhiweibiaoDao.selBatchbyid(bmbh);
    }
    //根据部门编号添加职位
    @Override
    public int addzhiwei(Zhiweibiao zhiweibiao) {
        return zhiweibiaoDao.insert(zhiweibiao);
    }
    //根据id删除
    @Override
    public int deletezhiwei(int zwbh) {
        return zhiweibiaoDao.deleteById(zwbh);
    }
    //根据id修改职位
    @Override
    public int updatezhiwei(Zhiweibiao zhiweibiao) {
        return zhiweibiaoDao.updateById(zhiweibiao);
    }

    @Override
    public List<Zhiweibiao> selZw(int bmbh) {
        QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
        zhiweibiaoQueryWrapper.eq("bmbh",bmbh);
        return zhiweibiaoDao.selectList(zhiweibiaoQueryWrapper);
    }
}
