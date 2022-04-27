package com.trkj.hr.service;

import com.trkj.hr.pojo.Xinzijiluzibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Xinzijiluzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinzijiluzibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Xinzijiluzibiao queryById( );

    /**
     * 分页查询
     *
     * @param xinzijiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Xinzijiluzibiao> queryByPage(Xinzijiluzibiao xinzijiluzibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xinzijiluzibiao 实例对象
     * @return 实例对象
     */
    Xinzijiluzibiao insert(Xinzijiluzibiao xinzijiluzibiao);

    /**
     * 修改数据
     *
     * @param xinzijiluzibiao 实例对象
     * @return 实例对象
     */
//    Xinzijiluzibiao update(Xinzijiluzibiao xinzijiluzibiao);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
