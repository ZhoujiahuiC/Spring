package com.trkj.hr.service;

import com.trkj.hr.pojo.Userandrole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Userandrole)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface UserandroleService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Userandrole queryById( );

    /**
     * 分页查询
     *
     * @param userandrole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Userandrole> queryByPage(Userandrole userandrole, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param userandrole 实例对象
     * @return 实例对象
     */
    Userandrole insert(Userandrole userandrole);

    /**
     * 修改数据
     *
     * @param userandrole 实例对象
     * @return 实例对象
     */
//    Userandrole update(Userandrole userandrole);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
