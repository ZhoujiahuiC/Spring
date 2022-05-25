package com.trkj.hr.service;

import com.trkj.hr.pojo.Liuchengbiao;

import java.util.List;

public interface LiuchengbiaoService {
    List<Liuchengbiao> liuchengbiaos();
    int updateworkzt(Liuchengbiao liuchengbiao);
}
