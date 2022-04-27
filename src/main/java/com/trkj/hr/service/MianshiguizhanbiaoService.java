package com.trkj.hr.service;

import com.trkj.hr.pojo.Mianshiguizhanbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Mianshiguizhanbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface MianshiguizhanbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param mbh 主键
     * @return 实例对象
     */
    Mianshiguizhanbiao queryById(Integer mbh);

    /**
     * 分页查询
     *
     * @param mianshiguizhanbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Mianshiguizhanbiao> queryByPage(Mianshiguizhanbiao mianshiguizhanbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mianshiguizhanbiao 实例对象
     * @return 实例对象
     */
    Mianshiguizhanbiao insert(Mianshiguizhanbiao mianshiguizhanbiao);

    /**
     * 修改数据
     *
     * @param mianshiguizhanbiao 实例对象
     * @return 实例对象
     */
    Mianshiguizhanbiao update(Mianshiguizhanbiao mianshiguizhanbiao);

    /**
     * 通过主键删除数据
     *
     * @param mbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mbh);

}
