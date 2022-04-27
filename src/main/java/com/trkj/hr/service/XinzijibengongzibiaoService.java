package com.trkj.hr.service;

import com.trkj.hr.pojo.Xinzijibengongzibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Xinzijibengongzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinzijibengongzibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param xzjbbh 主键
     * @return 实例对象
     */
    Xinzijibengongzibiao queryById(Integer xzjbbh);

    /**
     * 分页查询
     *
     * @param xinzijibengongzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Xinzijibengongzibiao> queryByPage(Xinzijibengongzibiao xinzijibengongzibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 实例对象
     */
    Xinzijibengongzibiao insert(Xinzijibengongzibiao xinzijibengongzibiao);

    /**
     * 修改数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 实例对象
     */
    Xinzijibengongzibiao update(Xinzijibengongzibiao xinzijibengongzibiao);

    /**
     * 通过主键删除数据
     *
     * @param xzjbbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer xzjbbh);

}
