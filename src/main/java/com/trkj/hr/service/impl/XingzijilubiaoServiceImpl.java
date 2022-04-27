package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Xingzijilubiao;
import com.trkj.hr.mapper.XingzijilubiaoDao;
import com.trkj.hr.service.XingzijilubiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Xingzijilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xingzijilubiaoService")
public class XingzijilubiaoServiceImpl implements XingzijilubiaoService {
    @Resource
    private XingzijilubiaoDao xingzijilubiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param xzjlbh 主键
     * @return 实例对象
     */
    @Override
    public Xingzijilubiao queryById(Integer xzjlbh) {
        return this.xingzijilubiaoDao.queryById(xzjlbh);
    }

    /**
     * 分页查询
     *
     * @param xingzijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xingzijilubiao> queryByPage(Xingzijilubiao xingzijilubiao, PageRequest pageRequest) {
        long total = this.xingzijilubiaoDao.count(xingzijilubiao);
        return new PageImpl<>(this.xingzijilubiaoDao.queryAllByLimit(xingzijilubiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xingzijilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xingzijilubiao insert(Xingzijilubiao xingzijilubiao) {
        this.xingzijilubiaoDao.insert(xingzijilubiao);
        return xingzijilubiao;
    }

    /**
     * 修改数据
     *
     * @param xingzijilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xingzijilubiao update(Xingzijilubiao xingzijilubiao) {
        this.xingzijilubiaoDao.update(xingzijilubiao);
        return this.queryById(xingzijilubiao.getXzjlbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param xzjlbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer xzjlbh) {
        return this.xingzijilubiaoDao.deleteById(xzjlbh) > 0;
    }
}
