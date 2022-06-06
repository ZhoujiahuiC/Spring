package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Gonggaobiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Gonggaobiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface GonggaobiaoService {
    //添加公告
    int addgg(Gonggaobiao gonggaobiao);
    //分页查询公告
    IPage<Gonggaobiao> selectgg(int pageNum,int pageSize);
}
