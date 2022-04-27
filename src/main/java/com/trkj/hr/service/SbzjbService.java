package com.trkj.hr.service;

import com.trkj.hr.pojo.Sbzjb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Sbzjb)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface SbzjbService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Sbzjb queryById( );

    /**
     * 分页查询
     *
     * @param sbzjb 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Sbzjb> queryByPage(Sbzjb sbzjb, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param sbzjb 实例对象
     * @return 实例对象
     */
    Sbzjb insert(Sbzjb sbzjb);

    /**
     * 修改数据
     *
     * @param sbzjb 实例对象
     * @return 实例对象
     */
//    Sbzjb update(Sbzjb sbzjb);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
