package com.trkj.hr.service;

import com.trkj.hr.pojo.Gonggaobiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Gonggaobiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface GonggaobiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param ggbh 主键
     * @return 实例对象
     */
    Gonggaobiao queryById(Integer ggbh);

    /**
     * 分页查询
     *
     * @param gonggaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Gonggaobiao> queryByPage(Gonggaobiao gonggaobiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param gonggaobiao 实例对象
     * @return 实例对象
     */
    Gonggaobiao insert(Gonggaobiao gonggaobiao);

    /**
     * 修改数据
     *
     * @param gonggaobiao 实例对象
     * @return 实例对象
     */
    Gonggaobiao update(Gonggaobiao gonggaobiao);

    /**
     * 通过主键删除数据
     *
     * @param ggbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ggbh);

}
