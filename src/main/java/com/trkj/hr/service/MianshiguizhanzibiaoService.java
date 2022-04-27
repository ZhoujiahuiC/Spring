package com.trkj.hr.service;

import com.trkj.hr.pojo.Mianshiguizhanzibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Mianshiguizhanzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface MianshiguizhanzibiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param mzbh 主键
     * @return 实例对象
     */
    Mianshiguizhanzibiao queryById(Integer mzbh);

    /**
     * 分页查询
     *
     * @param mianshiguizhanzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Mianshiguizhanzibiao> queryByPage(Mianshiguizhanzibiao mianshiguizhanzibiao, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param mianshiguizhanzibiao 实例对象
     * @return 实例对象
     */
    Mianshiguizhanzibiao insert(Mianshiguizhanzibiao mianshiguizhanzibiao);

    /**
     * 修改数据
     *
     * @param mianshiguizhanzibiao 实例对象
     * @return 实例对象
     */
    Mianshiguizhanzibiao update(Mianshiguizhanzibiao mianshiguizhanzibiao);

    /**
     * 通过主键删除数据
     *
     * @param mzbh 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mzbh);

}
