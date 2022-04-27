package com.trkj.hr.service;

import com.trkj.hr.pojo.Shebaojishubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shebaojishubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShebaojishubiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param sbjsbh 主键
     * @return 实例对象
     */
    Shebaojishubiao queryById(Integer sbjsbh);

    /**
     * 分页查询
     *
     * @param shebaojishubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Shebaojishubiao> queryByPage(Shebaojishubiao shebaojishubiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param shebaojishubiao 实例对象
     * @return 实例对象
     */
    Shebaojishubiao insert(Shebaojishubiao shebaojishubiao);

    /**
     * 修改数据
     *
     * @param shebaojishubiao 实例对象
     * @return 实例对象
     */
    Shebaojishubiao update(Shebaojishubiao shebaojishubiao);

    /**
     * 通过主键删除数据
     *
     * @param sbjsbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sbjsbh);

}
