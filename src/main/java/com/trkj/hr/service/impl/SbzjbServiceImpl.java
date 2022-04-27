package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Sbzjb;
import com.trkj.hr.mapper.SbzjbDao;
import com.trkj.hr.service.SbzjbService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Sbzjb)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("sbzjbService")
public class SbzjbServiceImpl implements SbzjbService {
    @Resource
    private SbzjbDao sbzjbDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Sbzjb queryById( ) {
        return this.sbzjbDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param sbzjb 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Sbzjb> queryByPage(Sbzjb sbzjb, PageRequest pageRequest) {
        long total = this.sbzjbDao.count(sbzjb);
        return new PageImpl<>(this.sbzjbDao.queryAllByLimit(sbzjb, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sbzjb 实例对象
     * @return 实例对象
     */
    @Override
    public Sbzjb insert(Sbzjb sbzjb) {
        this.sbzjbDao.insert(sbzjb);
        return sbzjb;
    }

    /**
     * 修改数据
     *
     * @param sbzjb 实例对象
     * @return 实例对象
     */
//    @Override
//    public Sbzjb update(Sbzjb sbzjb) {
//        this.sbzjbDao.update(sbzjb);
//        return this.queryById(sbzjb.get());
//    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.sbzjbDao.deleteById() > 0;
    }
}
