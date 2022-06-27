package com.trkj.hr.service;

import com.trkj.hr.pojo.Kh;
import com.trkj.hr.vo.KhxxVo;

import java.util.List;

public interface KhService {
    List<KhxxVo> selectKh0(int khybh);
    List<Object> selectObjskh();
    int insertxxkh(Kh kh);
    int updatakh(Kh kh);
    List<KhxxVo> selectKh1(int khybh);
    List<KhxxVo> selectKh2(int ybh);
    List<KhxxVo> selectKh3(int ybh);
    List <Kh> selectkh4(int khid);
}
