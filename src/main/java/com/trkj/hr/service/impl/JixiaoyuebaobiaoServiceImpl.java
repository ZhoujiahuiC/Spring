package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jixiaoyuebaobiao;
import com.trkj.hr.mapper.JixiaoyuebaobiaoDao;
import com.trkj.hr.service.JixiaoyuebaobiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jixiaoyuebaobiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jixiaoyuebaobiaoService")
public class JixiaoyuebaobiaoServiceImpl implements JixiaoyuebaobiaoService {
    @Resource
    private JixiaoyuebaobiaoDao jixiaoyuebaobiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jxybbh 主键
     * @return 实例对象
     */
    @Override
    public Jixiaoyuebaobiao queryById(Integer jxybbh) {
        return this.jixiaoyuebaobiaoDao.queryById(jxybbh);
    }

    /**
     * 分页查询
     *
     * @param jixiaoyuebaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jixiaoyuebaobiao> queryByPage(Jixiaoyuebaobiao jixiaoyuebaobiao, PageRequest pageRequest) {
        long total = this.jixiaoyuebaobiaoDao.count(jixiaoyuebaobiao);
        return new PageImpl<>(this.jixiaoyuebaobiaoDao.queryAllByLimit(jixiaoyuebaobiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jixiaoyuebaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaoyuebaobiao insert(Jixiaoyuebaobiao jixiaoyuebaobiao) {
        this.jixiaoyuebaobiaoDao.insert(jixiaoyuebaobiao);
        return jixiaoyuebaobiao;
    }

    /**
     * 修改数据
     *
     * @param jixiaoyuebaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaoyuebaobiao update(Jixiaoyuebaobiao jixiaoyuebaobiao) {
        this.jixiaoyuebaobiaoDao.update(jixiaoyuebaobiao);
        return this.queryById(jixiaoyuebaobiao.getJxybbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jxybbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jxybbh) {
        return this.jixiaoyuebaobiaoDao.deleteById(jxybbh) > 0;
    }
}
