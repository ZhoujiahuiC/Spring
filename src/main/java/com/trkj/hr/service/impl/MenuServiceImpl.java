package com.trkj.hr.service.impl;


import com.trkj.hr.mapper.MenuDao;
import com.trkj.hr.mapper.RoleDao;
import com.trkj.hr.pojo.Menu;
import com.trkj.hr.service.MenuService;
import com.trkj.hr.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private MenuDao menuDao;
    @Override
    public List<Menu> getMenu(String name) {
        List<String> role_name= this.getRole_name(name);
        List<Menu> bymenus=null;

        if(role_name.size()!=0){
            System.out.println("role_name:"+role_name);
            bymenus= menuDao.findBymenus(role_name);
        }else {
            bymenus=new ArrayList<>();
        }
        System.out.println("sssss"+bymenus);
        return MenuUtil.assemberMenus(bymenus);
    }
    private List<String> getRole_name(String username){
        return roleDao.findRoleByusername(username);
    }
}
