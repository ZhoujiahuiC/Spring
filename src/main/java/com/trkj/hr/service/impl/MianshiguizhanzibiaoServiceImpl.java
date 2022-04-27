package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Mianshiguizhanzibiao;
import com.trkj.hr.mapper.MianshiguizhanzibiaoDao;
import com.trkj.hr.service.MianshiguizhanzibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("mianshiguizhanzibiaoService")
public class MianshiguizhanzibiaoServiceImpl implements MianshiguizhanzibiaoService {
    @Resource
    private MianshiguizhanzibiaoDao mianshiguizhanzibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mzbh 主键
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanzibiao queryById(Integer mzbh) {
        return this.mianshiguizhanzibiaoDao.queryById(mzbh);
    }

    /**
     * 分页查询
     *
     * @param mianshiguizhanzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Mianshiguizhanzibiao> queryByPage(Mianshiguizhanzibiao mianshiguizhanzibiao, PageRequest pageRequest) {
        long total = this.mianshiguizhanzibiaoDao.count(mianshiguizhanzibiao);
        return new PageImpl<>(this.mianshiguizhanzibiaoDao.queryAllByLimit(mianshiguizhanzibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param mianshiguizhanzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanzibiao insert(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        this.mianshiguizhanzibiaoDao.insert(mianshiguizhanzibiao);
        return mianshiguizhanzibiao;
    }

    /**
     * 修改数据
     *
     * @param mianshiguizhanzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanzibiao update(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        this.mianshiguizhanzibiaoDao.update(mianshiguizhanzibiao);
        return this.queryById(mianshiguizhanzibiao.getMzbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param mzbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mzbh) {
        return this.mianshiguizhanzibiaoDao.deleteById(mzbh) > 0;
    }
}
