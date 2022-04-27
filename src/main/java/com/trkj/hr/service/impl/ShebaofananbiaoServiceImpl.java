package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shebaofananbiao;
import com.trkj.hr.mapper.ShebaofananbiaoDao;
import com.trkj.hr.service.ShebaofananbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shebaofananbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shebaofananbiaoService")
public class ShebaofananbiaoServiceImpl implements ShebaofananbiaoService {
    @Resource
    private ShebaofananbiaoDao shebaofananbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sbbh 主键
     * @return 实例对象
     */
    @Override
    public Shebaofananbiao queryById(Integer sbbh) {
        return this.shebaofananbiaoDao.queryById(sbbh);
    }

    /**
     * 分页查询
     *
     * @param shebaofananbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shebaofananbiao> queryByPage(Shebaofananbiao shebaofananbiao, PageRequest pageRequest) {
        long total = this.shebaofananbiaoDao.count(shebaofananbiao);
        return new PageImpl<>(this.shebaofananbiaoDao.queryAllByLimit(shebaofananbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shebaofananbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shebaofananbiao insert(Shebaofananbiao shebaofananbiao) {
        this.shebaofananbiaoDao.insert(shebaofananbiao);
        return shebaofananbiao;
    }

    /**
     * 修改数据
     *
     * @param shebaofananbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shebaofananbiao update(Shebaofananbiao shebaofananbiao) {
        this.shebaofananbiaoDao.update(shebaofananbiao);
        return this.queryById(shebaofananbiao.getSbbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param sbbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sbbh) {
        return this.shebaofananbiaoDao.deleteById(sbbh) > 0;
    }
}
