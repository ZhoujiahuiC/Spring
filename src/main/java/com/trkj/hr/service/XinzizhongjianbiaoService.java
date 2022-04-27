package com.trkj.hr.service;

import com.trkj.hr.pojo.Xinzizhongjianbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Xinzizhongjianbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinzizhongjianbiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param xzzjbh 主键
     * @return 实例对象
     */
    Xinzizhongjianbiao queryById(Integer xzzjbh);

    /**
     * 分页查询
     *
     * @param xinzizhongjianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Xinzizhongjianbiao> queryByPage(Xinzizhongjianbiao xinzizhongjianbiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xinzizhongjianbiao 实例对象
     * @return 实例对象
     */
    Xinzizhongjianbiao insert(Xinzizhongjianbiao xinzizhongjianbiao);

    /**
     * 修改数据
     *
     * @param xinzizhongjianbiao 实例对象
     * @return 实例对象
     */
    Xinzizhongjianbiao update(Xinzizhongjianbiao xinzizhongjianbiao);

    /**
     * 通过主键删除数据
     *
     * @param xzzjbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer xzzjbh);

}
