package com.trkj.hr.service;

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
    List<Xinziyaosuxiangbiao> selAllxzys();
    //    修改薪资要素项金额
    int upxzysje(List<Xinziyaosuxiangbiao> list);

}
