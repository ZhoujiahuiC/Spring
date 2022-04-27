package com.trkj.hr.service;

import com.trkj.hr.pojo.Shenhesxqxbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shenhesxqxbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShenhesxqxbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param shsxid 主键
     * @return 实例对象
     */
    Shenhesxqxbiao queryById(Integer shsxid);

    /**
     * 分页查询
     *
     * @param shenhesxqxbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Shenhesxqxbiao> queryByPage(Shenhesxqxbiao shenhesxqxbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param shenhesxqxbiao 实例对象
     * @return 实例对象
     */
    Shenhesxqxbiao insert(Shenhesxqxbiao shenhesxqxbiao);

    /**
     * 修改数据
     *
     * @param shenhesxqxbiao 实例对象
     * @return 实例对象
     */
    Shenhesxqxbiao update(Shenhesxqxbiao shenhesxqxbiao);

    /**
     * 通过主键删除数据
     *
     * @param shsxid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shsxid);

}
