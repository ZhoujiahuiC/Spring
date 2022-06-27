package com.trkj.hr.service;

import com.trkj.hr.pojo.Zhiweibiao;

import java.util.List;

/**
 * (Zhiweibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ZhiweibiaoService {
    List<Zhiweibiao> selectBatchById(int bmbh);
    //根据部门编号添加职位
    int addzhiwei(Zhiweibiao zhiweibiao);
    //根据id删除
    int deletezhiwei(int zwbh);
    //根据id修改职位
    int updatezhiwei(Zhiweibiao zhiweibiao);

    List<Zhiweibiao> selZw(int bmbh);
}
