package com.trkj.hr.service;

import com.trkj.hr.pojo.Jiaqishenqibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jiaqishenqibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JiaqishenqibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param jqsqbh 主键
     * @return 实例对象
     */
    Jiaqishenqibiao queryById(Integer jqsqbh);

    /**
     * 分页查询
     *
     * @param jiaqishenqibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jiaqishenqibiao> queryByPage(Jiaqishenqibiao jiaqishenqibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jiaqishenqibiao 实例对象
     * @return 实例对象
     */
    Jiaqishenqibiao insert(Jiaqishenqibiao jiaqishenqibiao);

    /**
     * 修改数据
     *
     * @param jiaqishenqibiao 实例对象
     * @return 实例对象
     */
    Jiaqishenqibiao update(Jiaqishenqibiao jiaqishenqibiao);

    /**
     * 通过主键删除数据
     *
     * @param jqsqbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jqsqbh);

}
