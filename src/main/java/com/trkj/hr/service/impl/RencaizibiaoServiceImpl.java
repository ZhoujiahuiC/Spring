package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.mapper.RencaizibiaoDao;
import com.trkj.hr.service.RencaizibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Rencaizibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("rencaizibiaoService")
public class RencaizibiaoServiceImpl implements RencaizibiaoService {
    @Resource
    private RencaizibiaoDao rencaizibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rzbh 主键
     * @return 实例对象
     */
    @Override
    public Rencaizibiao queryById(Integer rzbh) {
        return this.rencaizibiaoDao.queryById(rzbh);
    }

    /**
     * 分页查询
     *
     * @param rencaizibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Rencaizibiao> queryByPage(Rencaizibiao rencaizibiao, PageRequest pageRequest) {
        long total = this.rencaizibiaoDao.count(rencaizibiao);
        return new PageImpl<>(this.rencaizibiaoDao.queryAllByLimit(rencaizibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param rencaizibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rencaizibiao insert(Rencaizibiao rencaizibiao) {
        this.rencaizibiaoDao.insert(rencaizibiao);
        return rencaizibiao;
    }

    /**
     * 修改数据
     *
     * @param rencaizibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rencaizibiao update(Rencaizibiao rencaizibiao) {
        this.rencaizibiaoDao.update(rencaizibiao);
        return this.queryById(rencaizibiao.getRzbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param rzbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rzbh) {
        return this.rencaizibiaoDao.deleteById(rzbh) > 0;
    }
}
