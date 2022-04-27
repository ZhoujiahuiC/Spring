package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shenghebiao;
import com.trkj.hr.mapper.ShenghebiaoDao;
import com.trkj.hr.service.ShenghebiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Shenghebiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shenghebiaoService")
public class ShenghebiaoServiceImpl implements ShenghebiaoService {
    @Resource
    private ShenghebiaoDao shenghebiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param shbid 主键
     * @return 实例对象
     */
    @Override
    public Shenghebiao queryById(Integer shbid) {
        return this.shenghebiaoDao.queryById(shbid);
    }

    /**
     * 分页查询
     *
     * @param shenghebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Shenghebiao> queryByPage(Shenghebiao shenghebiao, PageRequest pageRequest) {
        long total = this.shenghebiaoDao.count(shenghebiao);
        return new PageImpl<>(this.shenghebiaoDao.queryAllByLimit(shenghebiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param shenghebiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenghebiao insert(Shenghebiao shenghebiao) {
        this.shenghebiaoDao.insert(shenghebiao);
        return shenghebiao;
    }

    /**
     * 修改数据
     *
     * @param shenghebiao 实例对象
     * @return 实例对象
     */
    @Override
    public Shenghebiao update(Shenghebiao shenghebiao) {
        this.shenghebiaoDao.update(shenghebiao);
        return this.queryById(shenghebiao.getShbid());
    }

    /**
     * 通过主键删除数据
     *
     * @param shbid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer shbid) {
        return this.shenghebiaoDao.deleteById(shbid) > 0;
    }
}
