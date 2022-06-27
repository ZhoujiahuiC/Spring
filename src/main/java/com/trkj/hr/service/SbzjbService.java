package com.trkj.hr.service;

import com.trkj.hr.pojo.Sbzjb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Sbzjb)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface SbzjbService {
    //社保中间表查询所有
    List<Sbzjb> selectAll(Integer sbbh);
}
