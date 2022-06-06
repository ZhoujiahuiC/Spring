package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shebaofananbiao;
import com.trkj.hr.service.ShebaofananbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * (Shebaofananbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
//@CrossOrigin
public class ShebaofananbiaoController {
    @Autowired
    private ShebaofananbiaoService shebaofananbiaoService;
    //社保方案查询
    @GetMapping("/socialSecurity")
    @PreAuthorize("hasAuthority('/socialSecurityManagement')")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(shebaofananbiaoService.selectAll());
     }
     @GetMapping("/pageSocialSecurity")
     @PreAuthorize("hasAuthority('/socialSecurityManagement')")
     public AjaxResponse pageSocialSecurity(int pageNum,int pageSize){
        return AjaxResponse.success(shebaofananbiaoService.page(pageNum,pageSize));
     }

//    社保方案添加
    @PostMapping("/addSb")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse addSb(@RequestBody Shebaofananbiao shebaofananbiao){
        return AjaxResponse.success(shebaofananbiaoService.addSb(shebaofananbiao));
    }

//    社保方案单个删除
    @DeleteMapping("/deleteSb/{sbbh}")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse deleteOne(@PathVariable int sbbh){
        return AjaxResponse.success(shebaofananbiaoService.deleteById(sbbh));
    }
//    批量删除社保方案
    @PostMapping("/BatchDelSb")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public  AjaxResponse BatchDelSb(@RequestBody List<Integer> ids ){
        return AjaxResponse.success(shebaofananbiaoService.BatchDel(ids));
    }
    @GetMapping("/selBysbmc")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse selBysbmc(int pageNum,int pageSize,String name){

        return AjaxResponse.success(shebaofananbiaoService.selectlike(pageNum,pageSize,name));
    }
//    查询社保方案详情
//    @GetMapping("/selSbxq/{sbbh}")
//    public AjaxResponse selSbxq( int sbbh){
//        return AjaxResponse.success(shebaofananbiaoService.selSbxq(sbbh));
//    }
    //  查询社保方案详情mybatils-puls另一种写法
    @GetMapping("/selSbxq1")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse selSbxq1(int sbbh){
        return AjaxResponse.success(shebaofananbiaoService.selSbxq1(sbbh));
    }
    @PostMapping("/addSb2")
    public AjaxResponse addSb2(@RequestBody Shebaofananbiao shebaofananbiao){
        System.out.println(shebaofananbiao);
        return  AjaxResponse.success(shebaofananbiaoService.addSbfan(shebaofananbiao));

    }
}

