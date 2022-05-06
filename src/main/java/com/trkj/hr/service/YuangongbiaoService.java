package com.trkj.hr.service;

import com.trkj.hr.pojo.Yuangongbiao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Yuangongbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface YuangongbiaoService {
 boolean selectYg(String yzh,String ymm);

}
