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
import java.util.stream.Collectors;

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

    @Override
    public List<Menu> setAll() {
        List<Menu> menuList =null;
        List<Menu> list = menuDao.selectList(null);
        if(list.size()!=0){
            menuList=list.stream().filter(u -> u.getMenu_z_id()==0).collect(Collectors.toList());
            menuList.forEach(o->{
                List<Menu> two=list.stream().filter(u -> u.getMenu_z_id()==o.getMenu_id()).collect(Collectors.toList());
                o.setAsideChildren(two);
            });
        }

        return menuList;
    }

    @Override
    public int addMenu(Menu menu) {
        Menu menu1=new Menu();
        menu1.setMenu_z_id(menu.getMenu_z_id());
        menu1.setMenu_name(menu.getMenu_name());
        menu1.setComponent_name(menu.getComponent_name());
        menu1.setComponent_path(menu.getComponent_path());
        menu1.setUrl(menu.getUrl());
        int insert = menuDao.insert(menu1);
        QueryWrapper<Menu> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("menu_name",menu1.getMenu_name());
        Menu menu2 = menuDao.selectOne(queryWrapper);
        Role_menu role_menu = new Role_menu();
        role_menu.setMenu_id(menu2.getMenu_id());
        role_menu.setRole_id(3);
        int insert1 = roleMenuDao.insert(role_menu);
        return insert+insert1;
    }

    @Override
    public int upateMenu(Menu menu) {
        int i = menuDao.updateById(menu);
        return i;
    }

    @Override
    public int deleteMenu(int menu_id) {
        int i = menuDao.deleteById(menu_id);
        return i;
    }

    private List<String> getRole_name(String username){
        return roleDao.findRoleByusername(username); 
    }
}
