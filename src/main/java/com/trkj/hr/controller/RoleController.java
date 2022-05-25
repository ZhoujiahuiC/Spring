package com.trkj.hr.controller;

import com.trkj.hr.pojo.Role;
import com.trkj.hr.service.RoleService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("selectRole")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectRole(){
        return roleService.selectRole();
    }
    @PutMapping("updateIsuse")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse updateIsuse(@RequestBody Role role){
        return AjaxResponse.success(roleService.updateIsuse(role));
    }
    @PostMapping("insertRole")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse insertRole(@RequestBody Role role){
        log.debug("Role:{}",role);
        return AjaxResponse.success(roleService.insertRole(role));
    }
    @DeleteMapping("electRole")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse delectRole(int role_id){
        return AjaxResponse.success(roleService.delectRole(role_id));
    }
}
