package com.trkj.hr.service;

import com.trkj.hr.pojo.Rizhidianpingbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Rizhidianpingbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface RizhidianpingbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param rzdpbh 主键
     * @return 实例对象
     */
    Rizhidianpingbiao queryById(Integer rzdpbh);

    /**
     * 分页查询
     *
     * @param rizhidianpingbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Rizhidianpingbiao> queryByPage(Rizhidianpingbiao rizhidianpingbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param rizhidianpingbiao 实例对象
     * @return 实例对象
     */
    Rizhidianpingbiao insert(Rizhidianpingbiao rizhidianpingbiao);

    /**
     * 修改数据
     *
     * @param rizhidianpingbiao 实例对象
     * @return 实例对象
     */
    Rizhidianpingbiao update(Rizhidianpingbiao rizhidianpingbiao);

    /**
     * 通过主键删除数据
     *
     * @param rzdpbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rzdpbh);

}
