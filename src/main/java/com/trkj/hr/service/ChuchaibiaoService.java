package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Chuchaibiao;


/**
 * (Chuchaibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface ChuchaibiaoService {
    //根据分页查询该员工的出差记录
    IPage<Chuchaibiao> selectchuchai(int pageNum, int pageSize, int ybh);

}
