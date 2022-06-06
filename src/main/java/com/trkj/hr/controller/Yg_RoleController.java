package com.trkj.hr.controller;

import com.trkj.hr.pojo.Role;
import com.trkj.hr.service.Yg_RoleService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Yg_RoleController {
    @Autowired
    private Yg_RoleService yg_roleService;
    @PutMapping("/updateRoleYg")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse updateRoleYg(@RequestBody Role role){
        return AjaxResponse.success(yg_roleService.updateRoleYg(role));
    }
}
