package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.service.YuangongbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Yuangongbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("yuangongbiaoService")
public class YuangongbiaoServiceImpl implements YuangongbiaoService {
    @Resource
    private YuangongbiaoDao yuangongbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ybh 主键
     * @return 实例对象
     */
    @Override
    public Yuangongbiao queryById(Integer ybh) {
        return this.yuangongbiaoDao.queryById(ybh);
    }

    /**
     * 分页查询
     *
     * @param yuangongbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Yuangongbiao> queryByPage(Yuangongbiao yuangongbiao, PageRequest pageRequest) {
        long total = this.yuangongbiaoDao.count(yuangongbiao);
        return new PageImpl<>(this.yuangongbiaoDao.queryAllByLimit(yuangongbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param yuangongbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Yuangongbiao insert(Yuangongbiao yuangongbiao) {
        this.yuangongbiaoDao.insert(yuangongbiao);
        return yuangongbiao;
    }

    /**
     * 修改数据
     *
     * @param yuangongbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Yuangongbiao update(Yuangongbiao yuangongbiao) {
        this.yuangongbiaoDao.update(yuangongbiao);
        return this.queryById(yuangongbiao.getYbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param ybh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ybh) {
        return this.yuangongbiaoDao.deleteById(ybh) > 0;
    }
}
