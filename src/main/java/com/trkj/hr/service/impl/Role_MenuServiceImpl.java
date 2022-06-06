package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.Role_menuDao;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.pojo.Role_menu;
import com.trkj.hr.service.Role_MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Role_MenuServiceImpl implements Role_MenuService {
    @Autowired
    private Role_menuDao roleMenuDao;
    @Override
    public int updateRoleMenu(Role role) {
        QueryWrapper<Role_menu> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("role_id",role.getRole_id());
        int delete = roleMenuDao.delete(queryWrapper);
        Role_menu role_menu = new Role_menu();
        role_menu.setRole_id(role.getRole_id());
        int insert=0;
        for (int i: role.getMenu_id()) {
            role_menu.setMenu_id(i);
            insert= roleMenuDao.insert(role_menu);
        }
        return insert;
    }
}
