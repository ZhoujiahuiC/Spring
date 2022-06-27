package com.trkj.hr.service;

import com.trkj.hr.pojo.Khmbxx;
import com.trkj.hr.pojo.Khz;

import java.util.List;

public interface KhzService {
    boolean insertkhzs(Khz khz);
    List<Object> khzObjs();
    int updatakhz(List<Khz> khz);
    List<Khz> khzxxs(int khid);
}
