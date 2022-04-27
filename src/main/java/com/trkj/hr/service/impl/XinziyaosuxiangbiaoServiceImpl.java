package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import com.trkj.hr.mapper.XinziyaosuxiangbiaoDao;
import com.trkj.hr.service.XinziyaosuxiangbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Xinziyaosuxiangbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinziyaosuxiangbiaoService")
public class XinziyaosuxiangbiaoServiceImpl implements XinziyaosuxiangbiaoService {
    @Resource
    private XinziyaosuxiangbiaoDao xinziyaosuxiangbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param xzysbh 主键
     * @return 实例对象
     */
    @Override
    public Xinziyaosuxiangbiao queryById(Integer xzysbh) {
        return this.xinziyaosuxiangbiaoDao.queryById(xzysbh);
    }

    /**
     * 分页查询
     *
     * @param xinziyaosuxiangbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xinziyaosuxiangbiao> queryByPage(Xinziyaosuxiangbiao xinziyaosuxiangbiao, PageRequest pageRequest) {
        long total = this.xinziyaosuxiangbiaoDao.count(xinziyaosuxiangbiao);
        return new PageImpl<>(this.xinziyaosuxiangbiaoDao.queryAllByLimit(xinziyaosuxiangbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinziyaosuxiangbiao insert(Xinziyaosuxiangbiao xinziyaosuxiangbiao) {
        this.xinziyaosuxiangbiaoDao.insert(xinziyaosuxiangbiao);
        return xinziyaosuxiangbiao;
    }

    /**
     * 修改数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinziyaosuxiangbiao update(Xinziyaosuxiangbiao xinziyaosuxiangbiao) {
        this.xinziyaosuxiangbiaoDao.update(xinziyaosuxiangbiao);
        return this.queryById(xinziyaosuxiangbiao.getXzysbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param xzysbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer xzysbh) {
        return this.xinziyaosuxiangbiaoDao.deleteById(xzysbh) > 0;
    }
}
