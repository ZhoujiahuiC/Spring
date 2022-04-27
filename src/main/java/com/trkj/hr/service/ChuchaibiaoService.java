package com.trkj.hr.service;

import com.trkj.hr.pojo.Chuchaibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Chuchaibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface ChuchaibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param cbh 主键
     * @return 实例对象
     */
    Chuchaibiao queryById(Integer cbh);

    /**
     * 分页查询
     *
     * @param chuchaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Chuchaibiao> queryByPage(Chuchaibiao chuchaibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param chuchaibiao 实例对象
     * @return 实例对象
     */
    Chuchaibiao insert(Chuchaibiao chuchaibiao);

    /**
     * 修改数据
     *
     * @param chuchaibiao 实例对象
     * @return 实例对象
     */
    Chuchaibiao update(Chuchaibiao chuchaibiao);

    /**
     * 通过主键删除数据
     *
     * @param cbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cbh);

}
