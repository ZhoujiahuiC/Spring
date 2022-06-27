package com.trkj.hr.service;

import com.trkj.hr.pojo.Liuchengyewu;
import com.trkj.hr.pojo.Shenhetijiaobiao;

import java.util.List;

/**
 * (Shenhejilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ShenhetijiaobiaoService {
    int inserttianjia(Shenhetijiaobiao shenhetijiaobiao);
    List<Shenhetijiaobiao> selectyewu(int businessid);
}
