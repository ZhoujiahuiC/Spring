package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.mapper.BumenbiaoDao;
import com.trkj.hr.service.BumenbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Bumenbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:16
 */
@Service("bumenbiaoService")
public class BumenbiaoServiceImpl implements BumenbiaoService {
    @Resource
    private BumenbiaoDao bumenbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bmbh 主键
     * @return 实例对象
     */
    @Override
    public Bumenbiao queryById(Integer bmbh) {
        return this.bumenbiaoDao.queryById(bmbh);
    }

    /**
     * 分页查询
     *
     * @param bumenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Bumenbiao> queryByPage(Bumenbiao bumenbiao, PageRequest pageRequest) {
        long total = this.bumenbiaoDao.count(bumenbiao);
        return new PageImpl<>(this.bumenbiaoDao.queryAllByLimit(bumenbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param bumenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Bumenbiao insert(Bumenbiao bumenbiao) {
        this.bumenbiaoDao.insert(bumenbiao);
        return bumenbiao;
    }

    /**
     * 修改数据
     *
     * @param bumenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Bumenbiao update(Bumenbiao bumenbiao) {
        this.bumenbiaoDao.update(bumenbiao);
        return this.queryById(bumenbiao.getBmbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param bmbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bmbh) {
        return this.bumenbiaoDao.deleteById(bmbh) > 0;
    }
}
