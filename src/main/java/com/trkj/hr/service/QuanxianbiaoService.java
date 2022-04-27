package com.trkj.hr.service;

import com.trkj.hr.pojo.Quanxianbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Quanxianbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface QuanxianbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param qxbh 主键
     * @return 实例对象
     */
    Quanxianbiao queryById(Integer qxbh);

    /**
     * 分页查询
     *
     * @param quanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Quanxianbiao> queryByPage(Quanxianbiao quanxianbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param quanxianbiao 实例对象
     * @return 实例对象
     */
    Quanxianbiao insert(Quanxianbiao quanxianbiao);

    /**
     * 修改数据
     *
     * @param quanxianbiao 实例对象
     * @return 实例对象
     */
    Quanxianbiao update(Quanxianbiao quanxianbiao);

    /**
     * 通过主键删除数据
     *
     * @param qxbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer qxbh);

}
