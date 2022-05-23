package com.trkj.hr.controller;

import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.service.BumenbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * (Bumenbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:49
 */
@RestController
public class BumenbiaoController {
    @Autowired
    private BumenbiaoService bumenbiaoService;
    //分页查询部门
    @GetMapping("/selectdept")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selcet(int pageNum, int pageSize,String name){
        return AjaxResponse.success(bumenbiaoService.selectdept(pageNum,pageSize,name));
    }
    //添加部门信息
    @PostMapping("/adddept")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse adddept(@RequestBody Bumenbiao bumenbiao){
        return AjaxResponse.success(bumenbiaoService.adddept(bumenbiao));
    }
    //删除部门信息
    @DeleteMapping("/deletedept")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse deldept(int bmbh){

        return AjaxResponse.success(bumenbiaoService.deletedept(bmbh));
    }
    //修改部门信息
    @PostMapping("/updatedept")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse update(@RequestBody Bumenbiao bumenbiao){
        return AjaxResponse.success(bumenbiaoService.updatedept(bumenbiao));
    }
    //查询所有的部门名称
    @PreAuthorize("hasAuthority('/divisionManagement')")
    @GetMapping("/selectbmmc")
    public AjaxResponse selectbmmc(){

        return AjaxResponse.success(bumenbiaoService.selectbmmc());
    }
}

