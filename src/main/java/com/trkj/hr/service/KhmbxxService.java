package com.trkj.hr.service;

import com.trkj.hr.pojo.Khmbxx;

import java.util.List;

public interface KhmbxxService {
    List<Khmbxx> khmbxxs(int khmbid);
    List<Object> khmbxxObjs();
    boolean insertkhmbxxs(Khmbxx khmbxx);
    int deletekhmbxxs (Integer khmbid);
    List<Khmbxx> selectxxkhmbxx();
}
