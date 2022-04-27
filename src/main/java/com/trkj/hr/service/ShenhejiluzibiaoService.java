package com.trkj.hr.service;

import com.trkj.hr.pojo.Shenhejiluzibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shenhejiluzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShenhejiluzibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param shjlzbbh 主键
     * @return 实例对象
     */
    Shenhejiluzibiao queryById(Integer shjlzbbh);

    /**
     * 分页查询
     *
     * @param shenhejiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Shenhejiluzibiao> queryByPage(Shenhejiluzibiao shenhejiluzibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 实例对象
     */
    Shenhejiluzibiao insert(Shenhejiluzibiao shenhejiluzibiao);

    /**
     * 修改数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 实例对象
     */
    Shenhejiluzibiao update(Shenhejiluzibiao shenhejiluzibiao);

    /**
     * 通过主键删除数据
     *
     * @param shjlzbbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shjlzbbh);

}
