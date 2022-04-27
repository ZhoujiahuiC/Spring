package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Xinzizhongjianbiao;
import com.trkj.hr.mapper.XinzizhongjianbiaoDao;
import com.trkj.hr.service.XinzizhongjianbiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Xinzizhongjianbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinzizhongjianbiaoService")
public class XinzizhongjianbiaoServiceImpl implements XinzizhongjianbiaoService {
    @Resource
    private XinzizhongjianbiaoDao xinzizhongjianbiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param xzzjbh 主键
     * @return 实例对象
     */
    @Override
    public Xinzizhongjianbiao queryById(Integer xzzjbh) {
        return this.xinzizhongjianbiaoDao.queryById(xzzjbh);
    }

    /**
     * 分页查询
     *
     * @param xinzizhongjianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xinzizhongjianbiao> queryByPage(Xinzizhongjianbiao xinzizhongjianbiao, PageRequest pageRequest) {
        long total = this.xinzizhongjianbiaoDao.count(xinzizhongjianbiao);
        return new PageImpl<>(this.xinzizhongjianbiaoDao.queryAllByLimit(xinzizhongjianbiao, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xinzizhongjianbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinzizhongjianbiao insert(Xinzizhongjianbiao xinzizhongjianbiao) {
        this.xinzizhongjianbiaoDao.insert(xinzizhongjianbiao);
        return xinzizhongjianbiao;
    }

    /**
     * 修改数据
     *
     * @param xinzizhongjianbiao 实例对象
     * @return 实例对象
     */
    @Override
    public Xinzizhongjianbiao update(Xinzizhongjianbiao xinzizhongjianbiao) {
        this.xinzizhongjianbiaoDao.update(xinzizhongjianbiao);
        return this.queryById(xinzizhongjianbiao.getXzzjbh());
    }

    /**
     * 通过主键删除数据
     *
     * @param xzzjbh 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer xzzjbh) {
        return this.xinzizhongjianbiaoDao.deleteById(xzzjbh) > 0;
    }
}
