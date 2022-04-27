package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Tongzhibiao;
import com.trkj.hr.mapper.TongzhibiaoDao;
import com.trkj.hr.service.TongzhibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Tongzhibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("tongzhibiaoService")
public class TongzhibiaoServiceImpl implements TongzhibiaoService {
    @Resource
    private TongzhibiaoDao tongzhibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tzbh 主键
     * @return 实例对象
     */
    @Override
    public Tongzhibiao queryById(Integer tzbh) {
        return this.tongzhibiaoDao.queryById(tzbh);
    }

    /**
     * 分页查询
     *
     * @param tongzhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Tongzhibiao> queryByPage(Tongzhibiao tongzhibiao, PageRequest pageRequest) {
        long total = this.tongzhibiaoDao.count(tongzhibiao);
        return new PageImpl<>(this.tongzhibiaoDao.queryAllByLimit(tongzhibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param tongzhibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Tongzhibiao insert(Tongzhibiao tongzhibiao) {
        this.tongzhibiaoDao.insert(tongzhibiao);
        return tongzhibiao;
    }

    /**
     * 修改数据
     *
     * @param tongzhibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Tongzhibiao update(Tongzhibiao tongzhibiao) {
        this.tongzhibiaoDao.update(tongzhibiao);
        return this.queryById(tongzhibiao.getTzbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param tzbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tzbh) {
        return this.tongzhibiaoDao.deleteById(tzbh) > 0;
    }
}
