package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Xinziyaosuxiangbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */

public interface XinziyaosuxiangbiaoService {
//    查询所有薪资要素项
    IPage<Xinziyaosuxiangbiao> selAllxzys(int pageNum,int pageSize,String xzysmc);
//    修改薪资要素项金额
    int upxzysje(List<Xinziyaosuxiangbiao> list);
//    添加薪资要素项
    int addxzysx(Xinziyaosuxiangbiao xzysx);
//    修改单个薪资要素项金额
    int upxzysxje2(Xinziyaosuxiangbiao xinziyaosuxiangbiao);
//    删除薪资要素项
    int delxzysx(int xzysbh);
}
                                      