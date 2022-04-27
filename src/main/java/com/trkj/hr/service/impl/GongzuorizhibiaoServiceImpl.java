package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Gongzuorizhibiao;
import com.trkj.hr.mapper.GongzuorizhibiaoDao;
import com.trkj.hr.service.GongzuorizhibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Gongzuorizhibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("gongzuorizhibiaoService")
public class GongzuorizhibiaoServiceImpl implements GongzuorizhibiaoService {
    @Resource
    private GongzuorizhibiaoDao gongzuorizhibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gzrzbh 主键
     * @return 实例对象
     */
    @Override
    public Gongzuorizhibiao queryById(Integer gzrzbh) {
        return this.gongzuorizhibiaoDao.queryById(gzrzbh);
    }

    /**
     * 分页查询
     *
     * @param gongzuorizhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Gongzuorizhibiao> queryByPage(Gongzuorizhibiao gongzuorizhibiao, PageRequest pageRequest) {
        long total = this.gongzuorizhibiaoDao.count(gongzuorizhibiao);
        return new PageImpl<>(this.gongzuorizhibiaoDao.queryAllByLimit(gongzuorizhibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param gongzuorizhibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Gongzuorizhibiao insert(Gongzuorizhibiao gongzuorizhibiao) {
        this.gongzuorizhibiaoDao.insert(gongzuorizhibiao);
        return gongzuorizhibiao;
    }

    /**
     * 修改数据
     *
     * @param gongzuorizhibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Gongzuorizhibiao update(Gongzuorizhibiao gongzuorizhibiao) {
        this.gongzuorizhibiaoDao.update(gongzuorizhibiao);
        return this.queryById(gongzuorizhibiao.getGzrzbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param gzrzbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gzrzbh) {
        return this.gongzuorizhibiaoDao.deleteById(gzrzbh) > 0;
    }
}
