package com.trkj.hr.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.vo.JiedianxxVo;

import java.util.List;

public interface LiuchengjiedianbiaoService{
    List<JiedianxxVo> jiedianxx(int workid);
    int updataxx(Liuchengjiedianbiao liuchengjiedianbiao);
    int deletexx(Integer nodeid);
    List<Object> selectjieObjs();
    int insertxx(Liuchengjiedianbiao liuchengjiedianbiao);
    Boolean insertxx2(Liuchengjiedianbiao liuchengjiedianbiao);
    Integer selectcountjie(Integer workid);
}
