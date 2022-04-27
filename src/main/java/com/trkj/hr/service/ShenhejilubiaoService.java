package com.trkj.hr.service;

import com.trkj.hr.pojo.Shenhejilubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shenhejilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShenhejilubiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param shjlbh 主键
     * @return 实例对象
     */
    Shenhejilubiao queryById(Integer shjlbh);

    /**
     * 分页查询
     *
     * @param shenhejilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Shenhejilubiao> queryByPage(Shenhejilubiao shenhejilubiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param shenhejilubiao 实例对象
     * @return 实例对象
     */
    Shenhejilubiao insert(Shenhejilubiao shenhejilubiao);

    /**
     * 修改数据
     *
     * @param shenhejilubiao 实例对象
     * @return 实例对象
     */
    Shenhejilubiao update(Shenhejilubiao shenhejilubiao);

    /**
     * 通过主键删除数据
     *
     * @param shjlbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shjlbh);

}
