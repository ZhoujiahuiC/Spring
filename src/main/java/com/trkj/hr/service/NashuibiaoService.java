package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Nashuibiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Nashuibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */

public interface NashuibiaoService {
//    分页查询纳税金额
    List<Nashuibiao> nashuiList();
//添加纳税
    int addnashui(Nashuibiao nashuibiao);
//    删除
    int delnashui(int nsbbh);
//    修改
    int upnashui(Nashuibiao nashuibiao);

}
