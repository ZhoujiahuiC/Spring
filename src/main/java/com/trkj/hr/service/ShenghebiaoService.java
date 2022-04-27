package com.trkj.hr.service;

import com.trkj.hr.pojo.Shenghebiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Shenghebiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShenghebiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param shbid 主键
     * @return 实例对象
     */
    Shenghebiao queryById(Integer shbid);

    /**
     * 分页查询
     *
     * @param shenghebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Shenghebiao> queryByPage(Shenghebiao shenghebiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param shenghebiao 实例对象
     * @return 实例对象
     */
    Shenghebiao insert(Shenghebiao shenghebiao);

    /**
     * 修改数据
     *
     * @param shenghebiao 实例对象
     * @return 实例对象
     */
    Shenghebiao update(Shenghebiao shenghebiao);

    /**
     * 通过主键删除数据
     *
     * @param shbid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer shbid);

}
