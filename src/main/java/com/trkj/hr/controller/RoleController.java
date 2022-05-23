package com.trkj.hr.controller;

import com.trkj.hr.pojo.Role;
import com.trkj.hr.service.RoleService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("selectRole")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectRole(){
        return roleService.selectRole();
    }
    @PutMapping("updateRole")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse updateRole(@RequestBody Role role){
        return AjaxResponse.success(roleService.updateIsuse(role));
    }
}
