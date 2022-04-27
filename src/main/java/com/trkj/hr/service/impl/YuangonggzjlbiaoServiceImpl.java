package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Yuangonggzjlbiao;
import com.trkj.hr.mapper.YuangonggzjlbiaoDao;
import com.trkj.hr.service.YuangonggzjlbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Yuangonggzjlbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("yuangonggzjlbiaoService")
public class YuangonggzjlbiaoServiceImpl implements YuangonggzjlbiaoService {
    @Resource
    private YuangonggzjlbiaoDao yuangonggzjlbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param yggzbh 主键
     * @return 实例对象
     */
    @Override
    public Yuangonggzjlbiao queryById(Integer yggzbh) {
        return this.yuangonggzjlbiaoDao.queryById(yggzbh);
    }

    /**
     * 分页查询
     *
     * @param yuangonggzjlbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Yuangonggzjlbiao> queryByPage(Yuangonggzjlbiao yuangonggzjlbiao, PageRequest pageRequest) {
        long total = this.yuangonggzjlbiaoDao.count(yuangonggzjlbiao);
        return new PageImpl<>(this.yuangonggzjlbiaoDao.queryAllByLimit(yuangonggzjlbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param yuangonggzjlbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Yuangonggzjlbiao insert(Yuangonggzjlbiao yuangonggzjlbiao) {
        this.yuangonggzjlbiaoDao.insert(yuangonggzjlbiao);
        return yuangonggzjlbiao;
    }

    /**
     * 修改数据
     *
     * @param yuangonggzjlbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Yuangonggzjlbiao update(Yuangonggzjlbiao yuangonggzjlbiao) {
        this.yuangonggzjlbiaoDao.update(yuangonggzjlbiao);
        return this.queryById(yuangonggzjlbiao.getYggzbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param yggzbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer yggzbh) {
        return this.yuangonggzjlbiaoDao.deleteById(yggzbh) > 0;
    }
}
