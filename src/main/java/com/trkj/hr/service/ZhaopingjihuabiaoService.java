package com.trkj.hr.service;

import com.trkj.hr.pojo.Zhaopingjihuabiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Zhaopingjihuabiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ZhaopingjihuabiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param zbh 主键
     * @return 实例对象
     */
    Zhaopingjihuabiao queryById(Integer zbh);

    /**
     * 分页查询
     *
     * @param zhaopingjihuabiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Zhaopingjihuabiao> queryByPage(Zhaopingjihuabiao zhaopingjihuabiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param zhaopingjihuabiao 实例对象
     * @return 实例对象
     */
    Zhaopingjihuabiao insert(Zhaopingjihuabiao zhaopingjihuabiao);

    /**
     * 修改数据
     *
     * @param zhaopingjihuabiao 实例对象
     * @return 实例对象
     */
    Zhaopingjihuabiao update(Zhaopingjihuabiao zhaopingjihuabiao);

    /**
     * 通过主键删除数据
     *
     * @param zbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer zbh);

}
