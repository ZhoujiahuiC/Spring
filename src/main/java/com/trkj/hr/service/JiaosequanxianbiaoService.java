package com.trkj.hr.service;

import com.trkj.hr.pojo.Jiaosequanxianbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jiaosequanxianbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface JiaosequanxianbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Jiaosequanxianbiao queryById( );

    /**
     * 分页查询
     *
     * @param jiaosequanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jiaosequanxianbiao> queryByPage(Jiaosequanxianbiao jiaosequanxianbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jiaosequanxianbiao 实例对象
     * @return 实例对象
     */
    Jiaosequanxianbiao insert(Jiaosequanxianbiao jiaosequanxianbiao);

    /**
     * 修改数据
     *
     * @param jiaosequanxianbiao 实例对象
     * @return 实例对象
     */
//    Jiaosequanxianbiao update(Jiaosequanxianbiao jiaosequanxianbiao);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
