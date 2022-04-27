package com.trkj.hr.service;

import com.trkj.hr.pojo.Jixiaodinjibiao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jixiaodinjibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JixiaodinjibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param jdbh 主键
     * @return 实例对象
     */
    Jixiaodinjibiao queryById(Integer jdbh);

    /**
     * 分页查询
     *
     * @param jixiaodinjibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jixiaodinjibiao> queryByPage(Jixiaodinjibiao jixiaodinjibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jixiaodinjibiao 实例对象
     * @return 实例对象
     */
    Jixiaodinjibiao insert(Jixiaodinjibiao jixiaodinjibiao);

    /**
     * 修改数据
     *
     * @param jixiaodinjibiao 实例对象
     * @return 实例对象
     */
    Jixiaodinjibiao update(Jixiaodinjibiao jixiaodinjibiao);

    /**
     * 通过主键删除数据
     *
     * @param jdbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jdbh);

}
