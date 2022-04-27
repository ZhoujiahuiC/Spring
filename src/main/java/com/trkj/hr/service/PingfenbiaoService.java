package com.trkj.hr.service;

import com.trkj.hr.pojo.Pingfenbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Pingfenbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface PingfenbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param pfbh 主键
     * @return 实例对象
     */
    Pingfenbiao queryById(Integer pfbh);

    /**
     * 分页查询
     *
     * @param pingfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Pingfenbiao> queryByPage(Pingfenbiao pingfenbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pingfenbiao 实例对象
     * @return 实例对象
     */
    Pingfenbiao insert(Pingfenbiao pingfenbiao);

    /**
     * 修改数据
     *
     * @param pingfenbiao 实例对象
     * @return 实例对象
     */
    Pingfenbiao update(Pingfenbiao pingfenbiao);

    /**
     * 通过主键删除数据
     *
     * @param pfbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pfbh);

}
