package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jixiaopinfenbiao;
import com.trkj.hr.mapper.JixiaopinfenbiaoDao;
import com.trkj.hr.service.JixiaopinfenbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jixiaopinfenbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jixiaopinfenbiaoService")
public class JixiaopinfenbiaoServiceImpl implements JixiaopinfenbiaoService {
    @Resource
    private JixiaopinfenbiaoDao jixiaopinfenbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jxbh 主键
     * @return 实例对象
     */
    @Override
    public Jixiaopinfenbiao queryById(Integer jxbh) {
        return this.jixiaopinfenbiaoDao.queryById(jxbh);
    }

    /**
     * 分页查询
     *
     * @param jixiaopinfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jixiaopinfenbiao> queryByPage(Jixiaopinfenbiao jixiaopinfenbiao, PageRequest pageRequest) {
        long total = this.jixiaopinfenbiaoDao.count(jixiaopinfenbiao);
        return new PageImpl<>(this.jixiaopinfenbiaoDao.queryAllByLimit(jixiaopinfenbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaopinfenbiao insert(Jixiaopinfenbiao jixiaopinfenbiao) {
        this.jixiaopinfenbiaoDao.insert(jixiaopinfenbiao);
        return jixiaopinfenbiao;
    }

    /**
     * 修改数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaopinfenbiao update(Jixiaopinfenbiao jixiaopinfenbiao) {
        this.jixiaopinfenbiaoDao.update(jixiaopinfenbiao);
        return this.queryById(jixiaopinfenbiao.getJxbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jxbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jxbh) {
        return this.jixiaopinfenbiaoDao.deleteById(jxbh) > 0;
    }
}
