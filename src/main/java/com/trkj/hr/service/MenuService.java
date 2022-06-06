package com.trkj.hr.service;

import com.trkj.hr.pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(String name);
    List<Menu> setMenu(int role_id);
}
