package com.trkj.hr.service;

import com.trkj.hr.pojo.Xingzijilubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Xingzijilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XingzijilubiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param xzjlbh 主键
     * @return 实例对象
     */
    Xingzijilubiao queryById(Integer xzjlbh);

    /**
     * 分页查询
     *
     * @param xingzijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Xingzijilubiao> queryByPage(Xingzijilubiao xingzijilubiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xingzijilubiao 实例对象
     * @return 实例对象
     */
    Xingzijilubiao insert(Xingzijilubiao xingzijilubiao);

    /**
     * 修改数据
     *
     * @param xingzijilubiao 实例对象
     * @return 实例对象
     */
    Xingzijilubiao update(Xingzijilubiao xingzijilubiao);

    /**
     * 通过主键删除数据
     *
     * @param xzjlbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer xzjlbh);

}
