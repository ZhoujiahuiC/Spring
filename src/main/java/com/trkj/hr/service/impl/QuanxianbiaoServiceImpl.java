package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Quanxianbiao;
import com.trkj.hr.mapper.QuanxianbiaoDao;
import com.trkj.hr.service.QuanxianbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Quanxianbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("quanxianbiaoService")
public class QuanxianbiaoServiceImpl implements QuanxianbiaoService {
    @Resource
    private QuanxianbiaoDao quanxianbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qxbh 主键
     * @return 实例对象
     */
    @Override
    public Quanxianbiao queryById(Integer qxbh) {
        return this.quanxianbiaoDao.queryById(qxbh);
    }

    /**
     * 分页查询
     *
     * @param quanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Quanxianbiao> queryByPage(Quanxianbiao quanxianbiao, PageRequest pageRequest) {
        long total = this.quanxianbiaoDao.count(quanxianbiao);
        return new PageImpl<>(this.quanxianbiaoDao.queryAllByLimit(quanxianbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param quanxianbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Quanxianbiao insert(Quanxianbiao quanxianbiao) {
        this.quanxianbiaoDao.insert(quanxianbiao);
        return quanxianbiao;
    }

    /**
     * 修改数据
     *
     * @param quanxianbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Quanxianbiao update(Quanxianbiao quanxianbiao) {
        this.quanxianbiaoDao.update(quanxianbiao);
        return this.queryById(quanxianbiao.getQxbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param qxbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer qxbh) {
        return this.quanxianbiaoDao.deleteById(qxbh) > 0;
    }
}
