package com.trkj.hr.service;

import com.trkj.hr.pojo.Khmb;

import java.util.List;

public interface KhmbService {
    List<Khmb> khmns();
    List<Object> khmbObjs();
    int insertkhmb(Khmb khmb);
    int deletekhmb(Integer khmbid);
}
