package com.trkj.hr.service;

import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Xinziyaosuxiangbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinziyaosuxiangbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param xzysbh 主键
     * @return 实例对象
     */
    Xinziyaosuxiangbiao queryById(Integer xzysbh);

    /**
     * 分页查询
     *
     * @param xinziyaosuxiangbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Xinziyaosuxiangbiao> queryByPage(Xinziyaosuxiangbiao xinziyaosuxiangbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 实例对象
     */
    Xinziyaosuxiangbiao insert(Xinziyaosuxiangbiao xinziyaosuxiangbiao);

    /**
     * 修改数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 实例对象
     */
    Xinziyaosuxiangbiao update(Xinziyaosuxiangbiao xinziyaosuxiangbiao);

    /**
     * 通过主键删除数据
     *
     * @param xzysbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer xzysbh);

}
