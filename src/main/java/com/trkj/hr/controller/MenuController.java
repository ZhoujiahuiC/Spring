package com.trkj.hr.controller;

import com.trkj.hr.pojo.Menu;
import com.trkj.hr.service.MenuService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/selectMenus")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectMenus(){
        return AjaxResponse.success(menuService.setAll());
    }
    @PostMapping("/addMenu")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse addMenu(@RequestBody Menu menu){
        return AjaxResponse.success(menuService.addMenu(menu));
    }
    @PutMapping("/updateMenu")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse updateMenu(@RequestBody Menu menu){
        return AjaxResponse.success(menuService.upateMenu(menu));
    }
    @DeleteMapping("/deleteMenu")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse deleteMenu(int menu_id){
        return AjaxResponse.success(menuService.deleteMenu(menu_id));
    }
}

