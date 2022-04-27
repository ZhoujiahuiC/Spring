package com.trkj.hr.service;

import com.trkj.hr.pojo.Tongzhibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Tongzhibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface TongzhibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param tzbh 主键
     * @return 实例对象
     */
    Tongzhibiao queryById(Integer tzbh);

    /**
     * 分页查询
     *
     * @param tongzhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Tongzhibiao> queryByPage(Tongzhibiao tongzhibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param tongzhibiao 实例对象
     * @return 实例对象
     */
    Tongzhibiao insert(Tongzhibiao tongzhibiao);

    /**
     * 修改数据
     *
     * @param tongzhibiao 实例对象
     * @return 实例对象
     */
    Tongzhibiao update(Tongzhibiao tongzhibiao);

    /**
     * 通过主键删除数据
     *
     * @param tzbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tzbh);

}
