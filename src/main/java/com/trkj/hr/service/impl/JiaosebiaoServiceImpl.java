package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jiaosebiao;
import com.trkj.hr.mapper.JiaosebiaoDao;
import com.trkj.hr.service.JiaosebiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jiaosebiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jiaosebiaoService")
public class JiaosebiaoServiceImpl implements JiaosebiaoService {
    @Resource
    private JiaosebiaoDao jiaosebiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jsbh 主键
     * @return 实例对象
     */
    @Override
    public Jiaosebiao queryById(Integer jsbh) {
        return this.jiaosebiaoDao.queryById(jsbh);
    }

    /**
     * 分页查询
     *
     * @param jiaosebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jiaosebiao> queryByPage(Jiaosebiao jiaosebiao, PageRequest pageRequest) {
        long total = this.jiaosebiaoDao.count(jiaosebiao);
        return new PageImpl<>(this.jiaosebiaoDao.queryAllByLimit(jiaosebiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jiaosebiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jiaosebiao insert(Jiaosebiao jiaosebiao) {
        this.jiaosebiaoDao.insert(jiaosebiao);
        return jiaosebiao;
    }

    /**
     * 修改数据
     *
     * @param jiaosebiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jiaosebiao update(Jiaosebiao jiaosebiao) {
        this.jiaosebiaoDao.update(jiaosebiao);
        return this.queryById(jiaosebiao.getJsbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jsbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jsbh) {
        return this.jiaosebiaoDao.deleteById(jsbh) > 0;
    }
}
