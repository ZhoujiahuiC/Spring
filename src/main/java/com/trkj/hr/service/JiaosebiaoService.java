package com.trkj.hr.service;

import com.trkj.hr.pojo.Jiaosebiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jiaosebiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JiaosebiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param jsbh 主键
     * @return 实例对象
     */
    Jiaosebiao queryById(Integer jsbh);

    /**
     * 分页查询
     *
     * @param jiaosebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jiaosebiao> queryByPage(Jiaosebiao jiaosebiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jiaosebiao 实例对象
     * @return 实例对象
     */
    Jiaosebiao insert(Jiaosebiao jiaosebiao);

    /**
     * 修改数据
     *
     * @param jiaosebiao 实例对象
     * @return 实例对象
     */
    Jiaosebiao update(Jiaosebiao jiaosebiao);

    /**
     * 通过主键删除数据
     *
     * @param jsbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jsbh);

}
