package com.trkj.hr.service;

import com.trkj.hr.pojo.Bumenbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Bumenbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:13
 */
public interface BumenbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param bmbh 主键
     * @return 实例对象
     */
    Bumenbiao queryById(Integer bmbh);

    /**
     * 分页查询
     *
     * @param bumenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Bumenbiao> queryByPage(Bumenbiao bumenbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param bumenbiao 实例对象
     * @return 实例对象
     */
    Bumenbiao insert(Bumenbiao bumenbiao);

    /**
     * 修改数据
     *
     * @param bumenbiao 实例对象
     * @return 实例对象
     */
    Bumenbiao update(Bumenbiao bumenbiao);

    /**
     * 通过主键删除数据
     *
     * @param bmbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bmbh);

}
