package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.service.ShebaojishubiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * (Shebaojishubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
//@CrossOrigin
public class ShebaojishubiaoController {
    @Autowired
    private ShebaojishubiaoService shebaojishubiaoService;
//    查询所有缴纳项目
    @GetMapping("/selJsmx")
    @PreAuthorize("hasAuthority('/socialSecurityManagement')")
    public AjaxResponse selJsmx(){
        return AjaxResponse.success(shebaojishubiaoService.selAll());
    }
//    添加社保项目
    @PostMapping("/addSbxm")
    @PreAuthorize("hasAuthority('/socialSecurityManagement')")
    public AjaxResponse addsbxm(@RequestBody Shebaojishubiao shebaojishubiao){
        return AjaxResponse.success(shebaojishubiaoService.addSbxm(shebaojishubiao));
    }
    @PutMapping("/upSbxm")
    @PreAuthorize("hasAuthority('/socialSecurityManagement')")
    public AjaxResponse upSbxm(@RequestBody Shebaojishubiao shebaojishubiao){
        return AjaxResponse.success(shebaojishubiaoService.upSbxm(shebaojishubiao));
    }
}

