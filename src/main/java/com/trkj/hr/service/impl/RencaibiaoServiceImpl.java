package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.mapper.RencaibiaoDao;
import com.trkj.hr.service.RencaibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Rencaibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("rencaibiaoService")
public class RencaibiaoServiceImpl implements RencaibiaoService {
    @Resource
    private RencaibiaoDao rencaibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public Rencaibiao queryById(Integer rid) {
        return this.rencaibiaoDao.queryById(rid);
    }

    /**
     * 分页查询
     *
     * @param rencaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Rencaibiao> queryByPage(Rencaibiao rencaibiao, PageRequest pageRequest) {
        long total = this.rencaibiaoDao.count(rencaibiao);
        return new PageImpl<>(this.rencaibiaoDao.queryAllByLimit(rencaibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param rencaibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rencaibiao insert(Rencaibiao rencaibiao) {
        this.rencaibiaoDao.insert(rencaibiao);
        return rencaibiao;
    }

    /**
     * 修改数据
     *
     * @param rencaibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Rencaibiao update(Rencaibiao rencaibiao) {
        this.rencaibiaoDao.update(rencaibiao);
        return this.queryById(rencaibiao.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.rencaibiaoDao.deleteById(rid) > 0;
    }
}
