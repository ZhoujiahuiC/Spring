package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Pingfenbiao;
import com.trkj.hr.mapper.PingfenbiaoDao;
import com.trkj.hr.service.PingfenbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Pingfenbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("pingfenbiaoService")
public class PingfenbiaoServiceImpl implements PingfenbiaoService {
    @Resource
    private PingfenbiaoDao pingfenbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pfbh 主键
     * @return 实例对象
     */
    @Override
    public Pingfenbiao queryById(Integer pfbh) {
        return this.pingfenbiaoDao.queryById(pfbh);
    }

    /**
     * 分页查询
     *
     * @param pingfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Pingfenbiao> queryByPage(Pingfenbiao pingfenbiao, PageRequest pageRequest) {
        long total = this.pingfenbiaoDao.count(pingfenbiao);
        return new PageImpl<>(this.pingfenbiaoDao.queryAllByLimit(pingfenbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pingfenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Pingfenbiao insert(Pingfenbiao pingfenbiao) {
        this.pingfenbiaoDao.insert(pingfenbiao);
        return pingfenbiao;
    }

    /**
     * 修改数据
     *
     * @param pingfenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Pingfenbiao update(Pingfenbiao pingfenbiao) {
        this.pingfenbiaoDao.update(pingfenbiao);
        return this.queryById(pingfenbiao.getPfbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param pfbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pfbh) {
        return this.pingfenbiaoDao.deleteById(pfbh) > 0;
    }
}
