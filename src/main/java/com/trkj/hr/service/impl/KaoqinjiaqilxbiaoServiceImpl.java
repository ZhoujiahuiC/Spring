package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Kaoqinjiaqilxbiao;
import com.trkj.hr.mapper.KaoqinjiaqilxbiaoDao;
import com.trkj.hr.service.KaoqinjiaqilxbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Kaoqinjiaqilxbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("kaoqinjiaqilxbiaoService")
public class KaoqinjiaqilxbiaoServiceImpl implements KaoqinjiaqilxbiaoService {
    @Resource
    private KaoqinjiaqilxbiaoDao kaoqinjiaqilxbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param kqjqbh 主键
     * @return 实例对象
     */
    @Override
    public Kaoqinjiaqilxbiao queryById(Integer kqjqbh) {
        return this.kaoqinjiaqilxbiaoDao.queryById(kqjqbh);
    }

    /**
     * 分页查询
     *
     * @param kaoqinjiaqilxbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Kaoqinjiaqilxbiao> queryByPage(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao, PageRequest pageRequest) {
        long total = this.kaoqinjiaqilxbiaoDao.count(kaoqinjiaqilxbiao);
        return new PageImpl<>(this.kaoqinjiaqilxbiaoDao.queryAllByLimit(kaoqinjiaqilxbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param kaoqinjiaqilxbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Kaoqinjiaqilxbiao insert(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao) {
        this.kaoqinjiaqilxbiaoDao.insert(kaoqinjiaqilxbiao);
        return kaoqinjiaqilxbiao;
    }

    /**
     * 修改数据
     *
     * @param kaoqinjiaqilxbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Kaoqinjiaqilxbiao update(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao) {
        this.kaoqinjiaqilxbiaoDao.update(kaoqinjiaqilxbiao);
        return this.queryById(kaoqinjiaqilxbiao.getKqjqbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param kqjqbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer kqjqbh) {
        return this.kaoqinjiaqilxbiaoDao.deleteById(kqjqbh) > 0;
    }
}
