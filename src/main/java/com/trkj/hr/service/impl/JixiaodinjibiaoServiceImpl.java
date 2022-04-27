package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.JixiaodinjibiaoDao;
import com.trkj.hr.pojo.Jixiaodinjibiao;
import com.trkj.hr.service.JixiaodinjibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jixiaodinjibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jixiaodinjibiaoService")
public class JixiaodinjibiaoServiceImpl implements JixiaodinjibiaoService {
    @Resource
    private JixiaodinjibiaoDao jixiaodinjibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jdbh 主键
     * @return 实例对象
     */
    @Override
    public Jixiaodinjibiao queryById(Integer jdbh) {
        return this.jixiaodinjibiaoDao.queryById(jdbh);
    }

    /**
     * 分页查询
     *
     * @param jixiaodinjibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jixiaodinjibiao> queryByPage(Jixiaodinjibiao jixiaodinjibiao, PageRequest pageRequest) {
        long total = this.jixiaodinjibiaoDao.count(jixiaodinjibiao);
        return new PageImpl<>(this.jixiaodinjibiaoDao.queryAllByLimit(jixiaodinjibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jixiaodinjibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaodinjibiao insert(Jixiaodinjibiao jixiaodinjibiao) {
        this.jixiaodinjibiaoDao.insert(jixiaodinjibiao);
        return jixiaodinjibiao;
    }

    /**
     * 修改数据
     *
     * @param jixiaodinjibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jixiaodinjibiao update(Jixiaodinjibiao jixiaodinjibiao) {
        this.jixiaodinjibiaoDao.update(jixiaodinjibiao);
        return this.queryById(jixiaodinjibiao.getJdbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jdbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jdbh) {
        return this.jixiaodinjibiaoDao.deleteById(jdbh) > 0;
    }
}
