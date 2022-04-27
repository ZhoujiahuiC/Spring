package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Mianshiguizhanbiao;
import com.trkj.hr.mapper.MianshiguizhanbiaoDao;
import com.trkj.hr.service.MianshiguizhanbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("mianshiguizhanbiaoService")
public class MianshiguizhanbiaoServiceImpl implements MianshiguizhanbiaoService {
    @Resource
    private MianshiguizhanbiaoDao mianshiguizhanbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mbh 主键
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanbiao queryById(Integer mbh) {
        return this.mianshiguizhanbiaoDao.queryById(mbh);
    }

    /**
     * 分页查询
     *
     * @param mianshiguizhanbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Mianshiguizhanbiao> queryByPage(Mianshiguizhanbiao mianshiguizhanbiao, PageRequest pageRequest) {
        long total = this.mianshiguizhanbiaoDao.count(mianshiguizhanbiao);
        return new PageImpl<>(this.mianshiguizhanbiaoDao.queryAllByLimit(mianshiguizhanbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param mianshiguizhanbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanbiao insert(Mianshiguizhanbiao mianshiguizhanbiao) {
        this.mianshiguizhanbiaoDao.insert(mianshiguizhanbiao);
        return mianshiguizhanbiao;
    }

    /**
     * 修改数据
     *
     * @param mianshiguizhanbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshiguizhanbiao update(Mianshiguizhanbiao mianshiguizhanbiao) {
        this.mianshiguizhanbiaoDao.update(mianshiguizhanbiao);
        return this.queryById(mianshiguizhanbiao.getMbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param mbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mbh) {
        return this.mianshiguizhanbiaoDao.deleteById(mbh) > 0;
    }
}
