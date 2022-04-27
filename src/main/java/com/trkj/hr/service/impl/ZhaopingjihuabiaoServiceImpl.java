package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.mapper.ZhaopingjihuabiaoDao;
import com.trkj.hr.service.ZhaopingjihuabiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Zhaopingjihuabiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("zhaopingjihuabiaoService")
public class ZhaopingjihuabiaoServiceImpl implements ZhaopingjihuabiaoService {
    @Resource
    private ZhaopingjihuabiaoDao zhaopingjihuabiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zbh 主键
     * @return 实例对象
     */
    @Override
    public Zhaopingjihuabiao queryById(Integer zbh) {
        return this.zhaopingjihuabiaoDao.queryById(zbh);
    }

    /**
     * 分页查询
     *
     * @param zhaopingjihuabiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Zhaopingjihuabiao> queryByPage(Zhaopingjihuabiao zhaopingjihuabiao, PageRequest pageRequest) {
        long total = this.zhaopingjihuabiaoDao.count(zhaopingjihuabiao);
        return new PageImpl<>(this.zhaopingjihuabiaoDao.queryAllByLimit(zhaopingjihuabiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param zhaopingjihuabiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhaopingjihuabiao insert(Zhaopingjihuabiao zhaopingjihuabiao) {
        this.zhaopingjihuabiaoDao.insert(zhaopingjihuabiao);
        return zhaopingjihuabiao;
    }

    /**
     * 修改数据
     *
     * @param zhaopingjihuabiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhaopingjihuabiao update(Zhaopingjihuabiao zhaopingjihuabiao) {
        this.zhaopingjihuabiaoDao.update(zhaopingjihuabiao);
        return this.queryById(zhaopingjihuabiao.getZbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param zbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer zbh) {
        return this.zhaopingjihuabiaoDao.deleteById(zbh) > 0;
    }
}
