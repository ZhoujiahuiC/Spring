package com.trkj.hr.service;

import com.trkj.hr.pojo.Yuangonggzjlbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Yuangonggzjlbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface YuangonggzjlbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param yggzbh 主键
     * @return 实例对象
     */
    Yuangonggzjlbiao queryById(Integer yggzbh);

    /**
     * 分页查询
     *
     * @param yuangonggzjlbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Yuangonggzjlbiao> queryByPage(Yuangonggzjlbiao yuangonggzjlbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param yuangonggzjlbiao 实例对象
     * @return 实例对象
     */
    Yuangonggzjlbiao insert(Yuangonggzjlbiao yuangonggzjlbiao);

    /**
     * 修改数据
     *
     * @param yuangonggzjlbiao 实例对象
     * @return 实例对象
     */
    Yuangonggzjlbiao update(Yuangonggzjlbiao yuangonggzjlbiao);

    /**
     * 通过主键删除数据
     *
     * @param yggzbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer yggzbh);

}
