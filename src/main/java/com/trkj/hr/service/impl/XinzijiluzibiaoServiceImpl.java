package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Xinzijiluzibiao;
import com.trkj.hr.mapper.XinzijiluzibiaoDao;
import com.trkj.hr.service.XinzijiluzibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Xinzijiluzibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinzijiluzibiaoService")
public class XinzijiluzibiaoServiceImpl implements XinzijiluzibiaoService {
    @Resource
    private XinzijiluzibiaoDao xinzijiluzibiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Xinzijiluzibiao queryById( ) {
        return this.xinzijiluzibiaoDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param xinzijiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xinzijiluzibiao> queryByPage(Xinzijiluzibiao xinzijiluzibiao, PageRequest pageRequest) {
        long total = this.xinzijiluzibiaoDao.count(xinzijiluzibiao);
        return new PageImpl<>(this.xinzijiluzibiaoDao.queryAllByLimit(xinzijiluzibiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xinzijiluzibiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinzijiluzibiao insert(Xinzijiluzibiao xinzijiluzibiao) {
        this.xinzijiluzibiaoDao.insert(xinzijiluzibiao);
        return xinzijiluzibiao;
    }

    /**
     * 修改数据
     *
     * @param xinzijiluzibiao 实例对象
     * @return 实例对象
     */
//    @Override
//    public Xinzijiluzibiao update(Xinzijiluzibiao xinzijiluzibiao) {
//        this.xinzijiluzibiaoDao.update(xinzijiluzibiao);
//        return this.queryById(xinzijiluzibiao.get());
//    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.xinzijiluzibiaoDao.deleteById() > 0;
    }
}
