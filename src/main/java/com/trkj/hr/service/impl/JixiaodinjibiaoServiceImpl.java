package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.JixiaodinjibiaoDao;
import com.trkj.hr.pojo.Jixiaodinjibiao;
import com.trkj.hr.service.JixiaodinjibiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * (Jixiaodinjibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jixiaodinjibiaoService")
public class JixiaodinjibiaoServiceImpl implements JixiaodinjibiaoService {
    @Autowired
    private JixiaodinjibiaoDao jixiaodinjibiaoDao;
    //绩效定级添加方法
    @Override
    public int addJixiaodinji(Jixiaodinjibiao jixiaodinjibiao) {
        return jixiaodinjibiaoDao.insert(jixiaodinjibiao);
    }
    //绩效定级查询方法
    @Override
    public List<Jixiaodinjibiao> selectAllJixiao() {
        return jixiaodinjibiaoDao.selectList(null);
    }
    //绩效定级修改方法
    @Override
    public int updateJixiaodinji(Jixiaodinjibiao jixiaodinjibiao) {
        return jixiaodinjibiaoDao.updateById(jixiaodinjibiao);
    }
    //批量删除
    @Override
    public int deleteJixiao(List<Integer> ids) {
        return jixiaodinjibiaoDao.deleteBatchIds(ids);
    }
    //单个删除
    @Override
    public int deleteOne(int jdbh) {
        return jixiaodinjibiaoDao.deleteById(jdbh);
    }
}
