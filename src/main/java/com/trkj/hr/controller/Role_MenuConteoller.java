package com.trkj.hr.controller;

import com.trkj.hr.pojo.Role;
import com.trkj.hr.service.Role_MenuService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Role_MenuConteoller {
    @Autowired
    private Role_MenuService role_menuService;
    @PutMapping("/updateRoleMenu")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse updateRoleMenu(@RequestBody Role role){
      return AjaxResponse.success(role_menuService.updateRoleMenu(role));
    }
}
