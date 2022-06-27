package com.trkj.hr.controller;

import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.service.ZhaopingjihuabiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Zhaopingjihuabiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController

public class ZhaopingjihuabiaoController {
    @Autowired
    private ZhaopingjihuabiaoService zhaopingjihuabiaoService;
    @GetMapping("/selZpjl")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/RecruitmentPlan','/recruitmentManagement'})")
    public AjaxResponse selZpjl(int pageNum,int pageSize,String bmmc,String zwmc){
        return AjaxResponse.success(zhaopingjihuabiaoService.selZpjl(pageNum,pageSize,bmmc,zwmc));
    }
    @PostMapping("/addZpjl")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/RecruitmentPlan','/recruitmentManagement'})")
    public AjaxResponse addZpjl(@RequestBody Zhaopingjihuabiao zhaopingjihuabiao){
        return AjaxResponse.success(zhaopingjihuabiaoService.addZpjl(zhaopingjihuabiao));
    }
    @PutMapping("/updateZpjl")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/RecruitmentPlan','/recruitmentManagement'})")
    public AjaxResponse updateZpjl(@RequestBody Zhaopingjihuabiao zhaopingjihuabiao){
        return AjaxResponse.success(zhaopingjihuabiaoService.updateZpjl(zhaopingjihuabiao));
    }
    @DeleteMapping("/deleteZpjl")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/RecruitmentPlan','/recruitmentManagement'})")
    public AjaxResponse deleteZpjl(int zbh){
        return AjaxResponse.success(zhaopingjihuabiaoService.deleteZpjl(zbh));
    }
}