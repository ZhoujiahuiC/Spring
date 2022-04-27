package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Mianshijilubiao;
import com.trkj.hr.mapper.MianshijilubiaoDao;
import com.trkj.hr.service.MianshijilubiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Mianshijilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("mianshijilubiaoService")
public class MianshijilubiaoServiceImpl implements MianshijilubiaoService {
    @Resource
    private MianshijilubiaoDao mianshijilubiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mjbh 主键
     * @return 实例对象
     */
    @Override
    public Mianshijilubiao queryById(Integer mjbh) {
        return this.mianshijilubiaoDao.queryById(mjbh);
    }

    /**
     * 分页查询
     *
     * @param mianshijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Mianshijilubiao> queryByPage(Mianshijilubiao mianshijilubiao, PageRequest pageRequest) {
        long total = this.mianshijilubiaoDao.count(mianshijilubiao);
        return new PageImpl<>(this.mianshijilubiaoDao.queryAllByLimit(mianshijilubiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param mianshijilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshijilubiao insert(Mianshijilubiao mianshijilubiao) {
        this.mianshijilubiaoDao.insert(mianshijilubiao);
        return mianshijilubiao;
    }

    /**
     * 修改数据
     *
     * @param mianshijilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Mianshijilubiao update(Mianshijilubiao mianshijilubiao) {
        this.mianshijilubiaoDao.update(mianshijilubiao);
        return this.queryById(mianshijilubiao.getMjbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param mjbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mjbh) {
        return this.mianshijilubiaoDao.deleteById(mjbh) > 0;
    }
}
