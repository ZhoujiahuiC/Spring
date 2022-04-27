package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.mapper.ZhiweibiaoDao;
import com.trkj.hr.service.ZhiweibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Zhiweibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("zhiweibiaoService")
public class ZhiweibiaoServiceImpl implements ZhiweibiaoService {
    @Resource
    private ZhiweibiaoDao zhiweibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zwbh 主键
     * @return 实例对象
     */
    @Override
    public Zhiweibiao queryById(Integer zwbh) {
        return this.zhiweibiaoDao.queryById(zwbh);
    }

    /**
     * 分页查询
     *
     * @param zhiweibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Zhiweibiao> queryByPage(Zhiweibiao zhiweibiao, PageRequest pageRequest) {
        long total = this.zhiweibiaoDao.count(zhiweibiao);
        return new PageImpl<>(this.zhiweibiaoDao.queryAllByLimit(zhiweibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param zhiweibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhiweibiao insert(Zhiweibiao zhiweibiao) {
        this.zhiweibiaoDao.insert(zhiweibiao);
        return zhiweibiao;
    }

    /**
     * 修改数据
     *
     * @param zhiweibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Zhiweibiao update(Zhiweibiao zhiweibiao) {
        this.zhiweibiaoDao.update(zhiweibiao);
        return this.queryById(zhiweibiao.getZwbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param zwbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer zwbh) {
        return this.zhiweibiaoDao.deleteById(zwbh) > 0;
    }
}
