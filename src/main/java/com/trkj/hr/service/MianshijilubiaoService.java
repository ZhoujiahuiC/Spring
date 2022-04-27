package com.trkj.hr.service;

import com.trkj.hr.pojo.Mianshijilubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Mianshijilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface MianshijilubiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param mjbh 主键
     * @return 实例对象
     */
    Mianshijilubiao queryById(Integer mjbh);

    /**
     * 分页查询
     *
     * @param mianshijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Mianshijilubiao> queryByPage(Mianshijilubiao mianshijilubiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mianshijilubiao 实例对象
     * @return 实例对象
     */
    Mianshijilubiao insert(Mianshijilubiao mianshijilubiao);

    /**
     * 修改数据
     *
     * @param mianshijilubiao 实例对象
     * @return 实例对象
     */
    Mianshijilubiao update(Mianshijilubiao mianshijilubiao);

    /**
     * 通过主键删除数据
     *
     * @param mjbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mjbh);

}
