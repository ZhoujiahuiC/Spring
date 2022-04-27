package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jixiaobiao;
import com.trkj.hr.mapper.JixiaobiaoDao;
import com.trkj.hr.service.JixiaobiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jixiaobiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jixiaobiaoService")
public class JixiaobiaoServiceImpl implements JixiaobiaoService {
    @Resource
    private JixiaobiaoDao jixiaobiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jbh 主键
     * @return 实例对象
     */
    @Override
    public Jixiaobiao queryById(Integer jbh) {
        return this.jixiaobiaoDao.queryById(jbh);
    }

    /**
     * 分页查询
     *
     * @param jixiaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jixiaobiao> queryByPage(Jixiaobiao jixiaobiao, PageRequest pageRequest) {
        long total = this.jixiaobiaoDao.count(jixiaobiao);
        return new PageImpl<>(this.jixiaobiaoDao.queryAllByLimit(jixiaobiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jixiaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaobiao insert(Jixiaobiao jixiaobiao) {
        this.jixiaobiaoDao.insert(jixiaobiao);
        return jixiaobiao;
    }

    /**
     * 修改数据
     *
     * @param jixiaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaobiao update(Jixiaobiao jixiaobiao) {
        this.jixiaobiaoDao.update(jixiaobiao);
        return this.queryById(jixiaobiao.getJbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jbh) {
        return this.jixiaobiaoDao.deleteById(jbh) > 0;
    }
}
