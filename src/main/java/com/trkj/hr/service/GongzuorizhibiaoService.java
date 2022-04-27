package com.trkj.hr.service;

import com.trkj.hr.pojo.Gongzuorizhibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Gongzuorizhibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface GongzuorizhibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param gzrzbh 主键
     * @return 实例对象
     */
    Gongzuorizhibiao queryById(Integer gzrzbh);

    /**
     * 分页查询
     *
     * @param gongzuorizhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Gongzuorizhibiao> queryByPage(Gongzuorizhibiao gongzuorizhibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param gongzuorizhibiao 实例对象
     * @return 实例对象
     */
    Gongzuorizhibiao insert(Gongzuorizhibiao gongzuorizhibiao);

    /**
     * 修改数据
     *
     * @param gongzuorizhibiao 实例对象
     * @return 实例对象
     */
    Gongzuorizhibiao update(Gongzuorizhibiao gongzuorizhibiao);

    /**
     * 通过主键删除数据
     *
     * @param gzrzbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer gzrzbh);

}
