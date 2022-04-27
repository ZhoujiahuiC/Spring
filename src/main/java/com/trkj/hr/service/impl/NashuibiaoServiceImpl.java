package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Nashuibiao;
import com.trkj.hr.mapper.NashuibiaoDao;
import com.trkj.hr.service.NashuibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Nashuibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("nashuibiaoService")
public class NashuibiaoServiceImpl implements NashuibiaoService {
    @Resource
    private NashuibiaoDao nashuibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param nsbbh 主键
     * @return 实例对象
     */
    @Override
    public Nashuibiao queryById(Integer nsbbh) {
        return this.nashuibiaoDao.queryById(nsbbh);
    }

    /**
     * 分页查询
     *
     * @param nashuibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Nashuibiao> queryByPage(Nashuibiao nashuibiao, PageRequest pageRequest) {
        long total = this.nashuibiaoDao.count(nashuibiao);
        return new PageImpl<>(this.nashuibiaoDao.queryAllByLimit(nashuibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param nashuibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Nashuibiao insert(Nashuibiao nashuibiao) {
        this.nashuibiaoDao.insert(nashuibiao);
        return nashuibiao;
    }

    /**
     * 修改数据
     *
     * @param nashuibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Nashuibiao update(Nashuibiao nashuibiao) {
        this.nashuibiaoDao.update(nashuibiao);
        return this.queryById(nashuibiao.getNsbbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param nsbbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer nsbbh) {
        return this.nashuibiaoDao.deleteById(nsbbh) > 0;
    }
}
