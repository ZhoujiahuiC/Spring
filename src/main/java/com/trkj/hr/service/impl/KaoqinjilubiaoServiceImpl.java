package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Kaoqinjilubiao;
import com.trkj.hr.mapper.KaoqinjilubiaoDao;
import com.trkj.hr.service.KaoqinjilubiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Kaoqinjilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("kaoqinjilubiaoService")
public class KaoqinjilubiaoServiceImpl implements KaoqinjilubiaoService {
    @Resource
    private KaoqinjilubiaoDao kaoqinjilubiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param kqjlbh 主键
     * @return 实例对象
     */
    @Override
    public Kaoqinjilubiao queryById(Integer kqjlbh) {
        return this.kaoqinjilubiaoDao.queryById(kqjlbh);
    }

    /**
     * 分页查询
     *
     * @param kaoqinjilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Kaoqinjilubiao> queryByPage(Kaoqinjilubiao kaoqinjilubiao, PageRequest pageRequest) {
        long total = this.kaoqinjilubiaoDao.count(kaoqinjilubiao);
        return new PageImpl<>(this.kaoqinjilubiaoDao.queryAllByLimit(kaoqinjilubiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Kaoqinjilubiao insert(Kaoqinjilubiao kaoqinjilubiao) {
        this.kaoqinjilubiaoDao.insert(kaoqinjilubiao);
        return kaoqinjilubiao;
    }

    /**
     * 修改数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 实例对象
     */
    @Override
    public Kaoqinjilubiao update(Kaoqinjilubiao kaoqinjilubiao) {
        this.kaoqinjilubiaoDao.update(kaoqinjilubiao);
        return this.queryById(kaoqinjilubiao.getKqjlbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param kqjlbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer kqjlbh) {
        return this.kaoqinjilubiaoDao.deleteById(kqjlbh) > 0;
    }
}
