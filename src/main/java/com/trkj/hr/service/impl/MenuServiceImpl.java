package com.trkj.hr.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.MenuDao;
import com.trkj.hr.mapper.RoleDao;
import com.trkj.hr.mapper.Role_menuDao;
import com.trkj.hr.pojo.Menu;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.pojo.Role_menu;
import com.trkj.hr.service.MenuService;
import com.trkj.hr.util.MenuUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MenuServiceImpl implements MenuService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private MenuDao menuDao;
    @Autowired
    private Role_menuDao roleMenuDao;
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

    @Override
    public List<Menu> setMenu(int role_id) {
        QueryWrapper<Role_menu> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("role_id",role_id);
//        QueryWrapper<Menu> queryWrapper1=new QueryWrapper<>();
//        queryWrapper1.eq("menu_z_id",0);
        List<Menu> list =menuDao.selectList(null);
        log.debug("list:{}",list);

        List<Role_menu> role_menus = roleMenuDao.selectList(queryWrapper);
        for (Menu m:list) {
            for (Role_menu rm:role_menus) {
                m.setDisabled(false);
                if(m.getMenu_id()==rm.getMenu_id()){
                    m.setDisabled(true);
                    break;
                }

            }
        }
        log.debug("List:{}",list);
        return list;
    }

    private List<String> getRole_name(String username){
        return roleDao.findRoleByusername(username); 
    }
}
