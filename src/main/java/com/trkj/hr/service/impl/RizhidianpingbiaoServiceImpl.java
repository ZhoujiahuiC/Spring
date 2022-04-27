package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.GonggaobiaoDao;
import com.trkj.hr.pojo.Rizhidianpingbiao;
import com.trkj.hr.mapper.RizhidianpingbiaoDao;
import com.trkj.hr.service.RizhidianpingbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Rizhidianpingbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:19
 */
@Service("rizhidianpingbiaoService")
public class RizhidianpingbiaoServiceImpl implements RizhidianpingbiaoService {
    @Resource
    private GonggaobiaoDao.RizhidianpingbiaoDao rizhidianpingbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rzdpbh 主键
     * @return 实例对象
     */
    @Override
    public Rizhidianpingbiao queryById(Integer rzdpbh) {
        return this.rizhidianpingbiaoDao.queryById(rzdpbh);
    }

    /**
     * 分页查询
     *
     * @param rizhidianpingbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Rizhidianpingbiao> queryByPage(Rizhidianpingbiao rizhidianpingbiao, PageRequest pageRequest) {
        long total = this.rizhidianpingbiaoDao.count(rizhidianpingbiao);
        return new PageImpl<>(this.rizhidianpingbiaoDao.queryAllByLimit(rizhidianpingbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param rizhidianpingbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rizhidianpingbiao insert(Rizhidianpingbiao rizhidianpingbiao) {
        this.rizhidianpingbiaoDao.insert(rizhidianpingbiao);
        return rizhidianpingbiao;
    }

    /**
     * 修改数据
     *
     * @param rizhidianpingbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rizhidianpingbiao update(Rizhidianpingbiao rizhidianpingbiao) {
        this.rizhidianpingbiaoDao.update(rizhidianpingbiao);
        return this.queryById(rizhidianpingbiao.getRzdpbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param rzdpbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rzdpbh) {
        return this.rizhidianpingbiaoDao.deleteById(rzdpbh) > 0;
    }
}
