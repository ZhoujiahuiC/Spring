package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Userandrole;
import com.trkj.hr.mapper.UserandroleDao;
import com.trkj.hr.service.UserandroleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Userandrole)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("userandroleService")
public class UserandroleServiceImpl implements UserandroleService {
    @Resource
    private UserandroleDao userandroleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Userandrole queryById( ) {
        return this.userandroleDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param userandrole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Userandrole> queryByPage(Userandrole userandrole, PageRequest pageRequest) {
        long total = this.userandroleDao.count(userandrole);
        return new PageImpl<>(this.userandroleDao.queryAllByLimit(userandrole, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param userandrole 实例对象
     * @return 实例对象
     */
    @Override
    public Userandrole insert(Userandrole userandrole) {
        this.userandroleDao.insert(userandrole);
        return userandrole;
    }

    /**
     * 修改数据
     *
     * @param userandrole 实例对象
     * @return 实例对象
     */
//    @Override
//    public Userandrole update(Userandrole userandrole) {
//        this.userandroleDao.update(userandrole);
//        return this.queryById(userandrole.get());
//    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.userandroleDao.deleteById() > 0;
    }
}
