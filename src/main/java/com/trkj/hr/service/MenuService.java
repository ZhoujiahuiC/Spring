package com.trkj.hr.service;

import com.trkj.hr.pojo.Menu;
import com.trkj.hr.vo.AjaxResponse;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(String name);
    List<Menu> setMenu(int role_id);

    List<Menu> setAll();

    int addMenu(Menu menu);

    int upateMenu(Menu menu);

    int deleteMenu(int menu_id);
}
