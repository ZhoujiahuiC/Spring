package com.trkj.hr.service;

import com.trkj.hr.pojo.Liuchengyewu;
import com.trkj.hr.vo.LiuchengywxxVo;

import java.util.List;

public interface LiuchengyewuService {
    List<LiuchengywxxVo> selectyewuxx(Integer ybh);
    List<Object> selectObjsyw();
    int insertyw(Liuchengyewu liuchengyewu);
    Integer selectcountyw(Integer businessid,Integer workid);
}
