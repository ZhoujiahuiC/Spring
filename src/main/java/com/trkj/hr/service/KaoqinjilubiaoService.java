package com.trkj.hr.service;

import com.trkj.hr.pojo.Kaoqinjilubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Kaoqinjilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface KaoqinjilubiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param kqjlbh 主键
     * @return 实例对象
     */
    Kaoqinjilubiao queryById(Integer kqjlbh);

    /**
     * 分页查询
     *
     * @param kaoqinjilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Kaoqinjilubiao> queryByPage(Kaoqinjilubiao kaoqinjilubiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 实例对象
     */
    Kaoqinjilubiao insert(Kaoqinjilubiao kaoqinjilubiao);

    /**
     * 修改数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 实例对象
     */
    Kaoqinjilubiao update(Kaoqinjilubiao kaoqinjilubiao);

    /**
     * 通过主键删除数据
     *
     * @param kqjlbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer kqjlbh);

}
