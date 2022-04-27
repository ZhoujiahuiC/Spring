package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Chuchaibiao;
import com.trkj.hr.mapper.ChuchaibiaoDao;
import com.trkj.hr.service.ChuchaibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Chuchaibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("chuchaibiaoService")
public class ChuchaibiaoServiceImpl implements ChuchaibiaoService {
    @Resource
    private ChuchaibiaoDao chuchaibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cbh 主键
     * @return 实例对象
     */
    @Override
    public Chuchaibiao queryById(Integer cbh) {
        return this.chuchaibiaoDao.queryById(cbh);
    }

    /**
     * 分页查询
     *
     * @param chuchaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Chuchaibiao> queryByPage(Chuchaibiao chuchaibiao, PageRequest pageRequest) {
        long total = this.chuchaibiaoDao.count(chuchaibiao);
        return new PageImpl<>(this.chuchaibiaoDao.queryAllByLimit(chuchaibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param chuchaibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Chuchaibiao insert(Chuchaibiao chuchaibiao) {
        this.chuchaibiaoDao.insert(chuchaibiao);
        return chuchaibiao;
    }

    /**
     * 修改数据
     *
     * @param chuchaibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Chuchaibiao update(Chuchaibiao chuchaibiao) {
        this.chuchaibiaoDao.update(chuchaibiao);
        return this.queryById(chuchaibiao.getCbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param cbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cbh) {
        return this.chuchaibiaoDao.deleteById(cbh) > 0;
    }
}
