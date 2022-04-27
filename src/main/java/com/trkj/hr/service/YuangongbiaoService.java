package com.trkj.hr.service;

import com.trkj.hr.pojo.Yuangongbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Yuangongbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface YuangongbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param ybh 主键
     * @return 实例对象
     */
    Yuangongbiao queryById(Integer ybh);

    /**
     * 分页查询
     *
     * @param yuangongbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Yuangongbiao> queryByPage(Yuangongbiao yuangongbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param yuangongbiao 实例对象
     * @return 实例对象
     */
    Yuangongbiao insert(Yuangongbiao yuangongbiao);

    /**
     * 修改数据
     *
     * @param yuangongbiao 实例对象
     * @return 实例对象
     */
    Yuangongbiao update(Yuangongbiao yuangongbiao);

    /**
     * 通过主键删除数据
     *
     * @param ybh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ybh);

}
