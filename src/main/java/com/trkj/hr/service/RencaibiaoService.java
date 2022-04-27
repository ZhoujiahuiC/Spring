package com.trkj.hr.service;

import com.trkj.hr.pojo.Rencaibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Rencaibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface RencaibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Rencaibiao queryById(Integer rid);

    /**
     * 分页查询
     *
     * @param rencaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Rencaibiao> queryByPage(Rencaibiao rencaibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rencaibiao 实例对象
     * @return 实例对象
     */
    Rencaibiao insert(Rencaibiao rencaibiao);

    /**
     * 修改数据
     *
     * @param rencaibiao 实例对象
     * @return 实例对象
     */
    Rencaibiao update(Rencaibiao rencaibiao);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}
