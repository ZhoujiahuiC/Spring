package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shenhesxqxbiao;
import com.trkj.hr.mapper.ShenhesxqxbiaoDao;
import com.trkj.hr.service.ShenhesxqxbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shenhesxqxbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shenhesxqxbiaoService")
public class ShenhesxqxbiaoServiceImpl implements ShenhesxqxbiaoService {
    @Resource
    private ShenhesxqxbiaoDao shenhesxqxbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shsxid 主键
     * @return 实例对象
     */
    @Override
    public Shenhesxqxbiao queryById(Integer shsxid) {
        return this.shenhesxqxbiaoDao.queryById(shsxid);
    }

    /**
     * 分页查询
     *
     * @param shenhesxqxbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shenhesxqxbiao> queryByPage(Shenhesxqxbiao shenhesxqxbiao, PageRequest pageRequest) {
        long total = this.shenhesxqxbiaoDao.count(shenhesxqxbiao);
        return new PageImpl<>(this.shenhesxqxbiaoDao.queryAllByLimit(shenhesxqxbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shenhesxqxbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhesxqxbiao insert(Shenhesxqxbiao shenhesxqxbiao) {
        this.shenhesxqxbiaoDao.insert(shenhesxqxbiao);
        return shenhesxqxbiao;
    }

    /**
     * 修改数据
     *
     * @param shenhesxqxbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenhesxqxbiao update(Shenhesxqxbiao shenhesxqxbiao) {
        this.shenhesxqxbiaoDao.update(shenhesxqxbiao);
        return this.queryById(shenhesxqxbiao.getShsxid());
    }

    /**
     * 通过主键删除数据
     *
     * @param shsxid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shsxid) {
        return this.shenhesxqxbiaoDao.deleteById(shsxid) > 0;
    }
}
