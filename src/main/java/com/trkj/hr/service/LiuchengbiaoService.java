package com.trkj.hr.service;

import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.vo.LiuchengxxVo;

import java.util.List;

public interface LiuchengbiaoService {
    List<Liuchengbiao> liuchengbiaos();
    int updateworkzt(Liuchengbiao liuchengbiao);
    List<LiuchengxxVo> selectxx(int workid);
    List<Liuchengbiao> selectliu(String workname);
    int deleteById(int workid);
}
