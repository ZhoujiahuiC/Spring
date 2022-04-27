package com.trkj.hr.service;

import com.trkj.hr.pojo.Jixiaopinfenbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jixiaopinfenbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JixiaopinfenbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param jxbh 主键
     * @return 实例对象
     */
    Jixiaopinfenbiao queryById(Integer jxbh);

    /**
     * 分页查询
     *
     * @param jixiaopinfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jixiaopinfenbiao> queryByPage(Jixiaopinfenbiao jixiaopinfenbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 实例对象
     */
    Jixiaopinfenbiao insert(Jixiaopinfenbiao jixiaopinfenbiao);

    /**
     * 修改数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 实例对象
     */
    Jixiaopinfenbiao update(Jixiaopinfenbiao jixiaopinfenbiao);

    /**
     * 通过主键删除数据
     *
     * @param jxbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jxbh);

}
