package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jiaqishenqibiao;
import com.trkj.hr.mapper.JiaqishenqibiaoDao;
import com.trkj.hr.service.JiaqishenqibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jiaqishenqibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jiaqishenqibiaoService")
public class JiaqishenqibiaoServiceImpl implements JiaqishenqibiaoService {
    @Resource
    private JiaqishenqibiaoDao jiaqishenqibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jqsqbh 主键
     * @return 实例对象
     */
    @Override
    public Jiaqishenqibiao queryById(Integer jqsqbh) {
        return this.jiaqishenqibiaoDao.queryById(jqsqbh);
    }

    /**
     * 分页查询
     *
     * @param jiaqishenqibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jiaqishenqibiao> queryByPage(Jiaqishenqibiao jiaqishenqibiao, PageRequest pageRequest) {
        long total = this.jiaqishenqibiaoDao.count(jiaqishenqibiao);
        return new PageImpl<>(this.jiaqishenqibiaoDao.queryAllByLimit(jiaqishenqibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jiaqishenqibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jiaqishenqibiao insert(Jiaqishenqibiao jiaqishenqibiao) {
        this.jiaqishenqibiaoDao.insert(jiaqishenqibiao);
        return jiaqishenqibiao;
    }

    /**
     * 修改数据
     *
     * @param jiaqishenqibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jiaqishenqibiao update(Jiaqishenqibiao jiaqishenqibiao) {
        this.jiaqishenqibiaoDao.update(jiaqishenqibiao);
        return this.queryById(jiaqishenqibiao.getJqsqbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param jqsqbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jqsqbh) {
        return this.jiaqishenqibiaoDao.deleteById(jqsqbh) > 0;
    }
}
