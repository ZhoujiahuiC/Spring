package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Jiaosequanxianbiao;
import com.trkj.hr.mapper.JiaosequanxianbiaoDao;
import com.trkj.hr.service.JiaosequanxianbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jiaosequanxianbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("jiaosequanxianbiaoService")
public class JiaosequanxianbiaoServiceImpl implements JiaosequanxianbiaoService {
    @Resource
    private JiaosequanxianbiaoDao jiaosequanxianbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public Jiaosequanxianbiao queryById( ) {
        return this.jiaosequanxianbiaoDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param jiaosequanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jiaosequanxianbiao> queryByPage(Jiaosequanxianbiao jiaosequanxianbiao, PageRequest pageRequest) {
        long total = this.jiaosequanxianbiaoDao.count(jiaosequanxianbiao);
        return new PageImpl<>(this.jiaosequanxianbiaoDao.queryAllByLimit(jiaosequanxianbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jiaosequanxianbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Jiaosequanxianbiao insert(Jiaosequanxianbiao jiaosequanxianbiao) {
        this.jiaosequanxianbiaoDao.insert(jiaosequanxianbiao);
        return jiaosequanxianbiao;
    }

    /**
     * 修改数据
     *
     * @param jiaosequanxianbiao 实例对象
     * @return 实例对象
     */
//    @Override
//    public Jiaosequanxianbiao update(Jiaosequanxianbiao jiaosequanxianbiao) {
//        this.jiaosequanxianbiaoDao.update(jiaosequanxianbiao);
//        return this.queryById(jiaosequanxianbiao.get());
//    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.jiaosequanxianbiaoDao.deleteById() > 0;
    }
}
