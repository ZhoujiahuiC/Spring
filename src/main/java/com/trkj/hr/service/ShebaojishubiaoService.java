package com.trkj.hr.service;

import com.trkj.hr.pojo.Shebaojishubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Shebaojishubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShebaojishubiaoService {
//    查询所有缴纳项目
    List<Shebaojishubiao> selAll();
//    添加社保项目
    int addSbxm(Shebaojishubiao shebaojishubiao);
//    修改社保项目
    int upSbxm(Shebaojishubiao shebaojishubiao);

}
