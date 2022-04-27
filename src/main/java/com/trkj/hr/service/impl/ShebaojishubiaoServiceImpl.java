package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.mapper.ShebaojishubiaoDao;
import com.trkj.hr.service.ShebaojishubiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shebaojishubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shebaojishubiaoService")
public class ShebaojishubiaoServiceImpl implements ShebaojishubiaoService {
    @Resource
    private ShebaojishubiaoDao shebaojishubiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sbjsbh 主键
     * @return 实例对象
     */
    @Override
    public Shebaojishubiao queryById(Integer sbjsbh) {
        return this.shebaojishubiaoDao.queryById(sbjsbh);
    }

    /**
     * 分页查询
     *
     * @param shebaojishubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shebaojishubiao> queryByPage(Shebaojishubiao shebaojishubiao, PageRequest pageRequest) {
        long total = this.shebaojishubiaoDao.count(shebaojishubiao);
        return new PageImpl<>(this.shebaojishubiaoDao.queryAllByLimit(shebaojishubiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shebaojishubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shebaojishubiao insert(Shebaojishubiao shebaojishubiao) {
        this.shebaojishubiaoDao.insert(shebaojishubiao);
        return shebaojishubiao;
    }

    /**
     * 修改数据
     *
     * @param shebaojishubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shebaojishubiao update(Shebaojishubiao shebaojishubiao) {
        this.shebaojishubiaoDao.update(shebaojishubiao);
        return this.queryById(shebaojishubiao.getSbjsbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param sbjsbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sbjsbh) {
        return this.shebaojishubiaoDao.deleteById(sbjsbh) > 0;
    }
}
