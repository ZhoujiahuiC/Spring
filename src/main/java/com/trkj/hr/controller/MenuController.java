package com.trkj.hr.controller;

import com.trkj.hr.service.MenuService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/selectListMenu")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectListMenu(int role_id){
        log.debug("role_id:{}",role_id);
        return AjaxResponse.success(menuService.setMenu(role_id));
    }
}

