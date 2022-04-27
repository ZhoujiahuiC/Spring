package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.mapper.XinzijibengongzibiaoDao;
import com.trkj.hr.service.XinzijibengongzibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Xinzijibengongzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinzijibengongzibiaoService")
public class XinzijibengongzibiaoServiceImpl implements XinzijibengongzibiaoService {
    @Resource
    private XinzijibengongzibiaoDao xinzijibengongzibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param xzjbbh 主键
     * @return 实例对象
     */
    @Override
    public Xinzijibengongzibiao queryById(Integer xzjbbh) {
        return this.xinzijibengongzibiaoDao.queryById(xzjbbh);
    }

    /**
     * 分页查询
     *
     * @param xinzijibengongzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xinzijibengongzibiao> queryByPage(Xinzijibengongzibiao xinzijibengongzibiao, PageRequest pageRequest) {
        long total = this.xinzijibengongzibiaoDao.count(xinzijibengongzibiao);
        return new PageImpl<>(this.xinzijibengongzibiaoDao.queryAllByLimit(xinzijibengongzibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinzijibengongzibiao insert(Xinzijibengongzibiao xinzijibengongzibiao) {
        this.xinzijibengongzibiaoDao.insert(xinzijibengongzibiao);
        return xinzijibengongzibiao;
    }

    /**
     * 修改数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinzijibengongzibiao update(Xinzijibengongzibiao xinzijibengongzibiao) {
        this.xinzijibengongzibiaoDao.update(xinzijibengongzibiao);
        return this.queryById(xinzijibengongzibiao.getXzjbbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param xzjbbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer xzjbbh) {
        return this.xinzijibengongzibiaoDao.deleteById(xzjbbh) > 0;
    }
}
