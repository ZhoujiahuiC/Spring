package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shenhejiluzibiao;
import com.trkj.hr.mapper.ShenhejiluzibiaoDao;
import com.trkj.hr.service.ShenhejiluzibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shenhejiluzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shenhejiluzibiaoService")
public class ShenhejiluzibiaoServiceImpl implements ShenhejiluzibiaoService {
    @Resource
    private ShenhejiluzibiaoDao shenhejiluzibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shjlzbbh 主键
     * @return 实例对象
     */
    @Override
    public Shenhejiluzibiao queryById(Integer shjlzbbh) {
        return this.shenhejiluzibiaoDao.queryById(shjlzbbh);
    }

    /**
     * 分页查询
     *
     * @param shenhejiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shenhejiluzibiao> queryByPage(Shenhejiluzibiao shenhejiluzibiao, PageRequest pageRequest) {
        long total = this.shenhejiluzibiaoDao.count(shenhejiluzibiao);
        return new PageImpl<>(this.shenhejiluzibiaoDao.queryAllByLimit(shenhejiluzibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhejiluzibiao insert(Shenhejiluzibiao shenhejiluzibiao) {
        this.shenhejiluzibiaoDao.insert(shenhejiluzibiao);
        return shenhejiluzibiao;
    }

    /**
     * 修改数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhejiluzibiao update(Shenhejiluzibiao shenhejiluzibiao) {
        this.shenhejiluzibiaoDao.update(shenhejiluzibiao);
        return this.queryById(shenhejiluzibiao.getShjlzbbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param shjlzbbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shjlzbbh) {
        return this.shenhejiluzibiaoDao.deleteById(shjlzbbh) > 0;
    }
}
