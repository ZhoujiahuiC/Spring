package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Gonggaobiao;
import com.trkj.hr.mapper.GonggaobiaoDao;
import com.trkj.hr.service.GonggaobiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Gonggaobiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("gonggaobiaoService")
public class GonggaobiaoServiceImpl implements GonggaobiaoService {
    @Resource
    private GonggaobiaoDao gonggaobiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ggbh 主键
     * @return 实例对象
     */
    @Override
    public Gonggaobiao queryById(Integer ggbh) {
        return this.gonggaobiaoDao.queryById(ggbh);
    }

    /**
     * 分页查询
     *
     * @param gonggaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Gonggaobiao> queryByPage(Gonggaobiao gonggaobiao, PageRequest pageRequest) {
        long total = this.gonggaobiaoDao.count(gonggaobiao);
        return new PageImpl<>(this.gonggaobiaoDao.queryAllByLimit(gonggaobiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param gonggaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Gonggaobiao insert(Gonggaobiao gonggaobiao) {
        this.gonggaobiaoDao.insert(gonggaobiao);
        return gonggaobiao;
    }

    /**
     * 修改数据
     *
     * @param gonggaobiao 实例对象
     * @return 实例对象
     */
    @Override
    public Gonggaobiao update(Gonggaobiao gonggaobiao) {
        this.gonggaobiaoDao.update(gonggaobiao);
        return this.queryById(gonggaobiao.getGgbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param ggbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ggbh) {
        return this.gonggaobiaoDao.deleteById(ggbh) > 0;
    }
}
