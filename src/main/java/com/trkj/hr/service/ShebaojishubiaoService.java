package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Shebaojishubiao;


import java.util.List;

/**
 * (Shebaojishubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShebaojishubiaoService {
//    查询所有缴纳项目
   IPage<Shebaojishubiao> selAll(int pageNum,int pageSize,String sbname);
//    添加社保项目
    int addSbxm(Shebaojishubiao shebaojishubiao);
//    修改社保项目
    int upSbxm(Shebaojishubiao shebaojishubiao);
//    删除社保项目
    int delSbxm(int sbjsbh);
//查询缴纳项目
    List<Shebaojishubiao> select();
}
