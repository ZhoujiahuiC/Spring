package com.trkj.hr.service;

import com.trkj.hr.pojo.Xingzijilubiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Xingzijilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XingzijilubiaoService {

    List<Xingzijilubiao> selAllxzjl();


}
