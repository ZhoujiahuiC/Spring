package com.trkj.hr.service;

import com.trkj.hr.pojo.Zhiweibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Zhiweibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ZhiweibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param zwbh 主键
     * @return 实例对象
     */
    Zhiweibiao queryById(Integer zwbh);

    /**
     * 分页查询
     *
     * @param zhiweibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Zhiweibiao> queryByPage(Zhiweibiao zhiweibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param zhiweibiao 实例对象
     * @return 实例对象
     */
    Zhiweibiao insert(Zhiweibiao zhiweibiao);

    /**
     * 修改数据
     *
     * @param zhiweibiao 实例对象
     * @return 实例对象
     */
    Zhiweibiao update(Zhiweibiao zhiweibiao);

    /**
     * 通过主键删除数据
     *
     * @param zwbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer zwbh);

}
