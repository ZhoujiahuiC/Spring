package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Xingzijilubiao;



/**
 * (Xinzijiluzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinzijiluzibiaoService {
    //根据员工id查询薪资记录
    IPage<Xingzijilubiao> selectxinzi(int pageNum, int pageSize, int ybh);
}
