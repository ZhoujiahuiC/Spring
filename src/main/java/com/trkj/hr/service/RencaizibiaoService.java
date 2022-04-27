package com.trkj.hr.service;

import com.trkj.hr.pojo.Rencaizibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Rencaizibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface RencaizibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param rzbh 主键
     * @return 实例对象
     */
    Rencaizibiao queryById(Integer rzbh);

    /**
     * 分页查询
     *
     * @param rencaizibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Rencaizibiao> queryByPage(Rencaizibiao rencaizibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rencaizibiao 实例对象
     * @return 实例对象
     */
    Rencaizibiao insert(Rencaizibiao rencaizibiao);

    /**
     * 修改数据
     *
     * @param rencaizibiao 实例对象
     * @return 实例对象
     */
    Rencaizibiao update(Rencaizibiao rencaizibiao);

    /**
     * 通过主键删除数据
     *
     * @param rzbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rzbh);

}
