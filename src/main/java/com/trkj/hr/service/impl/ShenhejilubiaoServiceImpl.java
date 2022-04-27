package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shenhejilubiao;
import com.trkj.hr.mapper.ShenhejilubiaoDao;
import com.trkj.hr.service.ShenhejilubiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shenhejilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shenhejilubiaoService")
public class ShenhejilubiaoServiceImpl implements ShenhejilubiaoService {
    @Resource
    private ShenhejilubiaoDao shenhejilubiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shjlbh 主键
     * @return 实例对象
     */
    @Override
    public Shenhejilubiao queryById(Integer shjlbh) {
        return this.shenhejilubiaoDao.queryById(shjlbh);
    }

    /**
     * 分页查询
     *
     * @param shenhejilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shenhejilubiao> queryByPage(Shenhejilubiao shenhejilubiao, PageRequest pageRequest) {
        long total = this.shenhejilubiaoDao.count(shenhejilubiao);
        return new PageImpl<>(this.shenhejilubiaoDao.queryAllByLimit(shenhejilubiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shenhejilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhejilubiao insert(Shenhejilubiao shenhejilubiao) {
        this.shenhejilubiaoDao.insert(shenhejilubiao);
        return shenhejilubiao;
    }

    /**
     * 修改数据
     *
     * @param shenhejilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhejilubiao update(Shenhejilubiao shenhejilubiao) {
        this.shenhejilubiaoDao.update(shenhejilubiao);
        return this.queryById(shenhejilubiao.getShjlbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param shjlbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shjlbh) {
        return this.shenhejilubiaoDao.deleteById(shjlbh) > 0;
    }
}
