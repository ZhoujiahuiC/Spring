package com.trkj.hr.service;

import com.trkj.hr.pojo.Jixiaobiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jixiaobiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JixiaobiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param jbh 主键
     * @return 实例对象
     */
    Jixiaobiao queryById(Integer jbh);

    /**
     * 分页查询
     *
     * @param jixiaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jixiaobiao> queryByPage(Jixiaobiao jixiaobiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jixiaobiao 实例对象
     * @return 实例对象
     */
    Jixiaobiao insert(Jixiaobiao jixiaobiao);

    /**
     * 修改数据
     *
     * @param jixiaobiao 实例对象
     * @return 实例对象
     */
    Jixiaobiao update(Jixiaobiao jixiaobiao);

    /**
     * 通过主键删除数据
     *
     * @param jbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jbh);

}
