package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.service.ShebaofananbiaoService;
import com.trkj.hr.service.ShebaojishubiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shebaojishubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController

public class ShebaojishubiaoController {
    @Autowired
    private  ShebaojishubiaoService shebaojishubiaoService;
//    查询所有缴纳项目
    @PreAuthorize("hasAuthority('/divisionManagement')")
    @GetMapping("/selJsmx")
    public AjaxResponse selJsmx(int pageNum,int pageSize,String sbmc){
        return AjaxResponse.success(shebaojishubiaoService.selAll(pageNum, pageSize, sbmc));
    }
//    添加社保项目
    @PostMapping("/addSbxm")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse addsbxm(@RequestBody Shebaojishubiao shebaojishubiao){
        return AjaxResponse.success(shebaojishubiaoService.addSbxm(shebaojishubiao));
    }
//    修改社保项目
    @PutMapping("/upSbxm")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse upSbxm(@RequestBody Shebaojishubiao shebaojishubiao){
        return AjaxResponse.success(shebaojishubiaoService.upSbxm(shebaojishubiao));
    }
//    删除社保项目
    @DeleteMapping("/delSbxm/{sbjsbh}")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse delSbxm(@PathVariable int sbjsbh){
        return AjaxResponse.success(shebaojishubiaoService.delSbxm(sbjsbh));
    }
//查询所有社保项目
    @GetMapping("/selsbjs")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selsbjs(){
        return AjaxResponse.success(shebaojishubiaoService.select());
    }
}

