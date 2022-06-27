package com.trkj.hr.controller;


import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.service.ZhiweibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * (Zhiweibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController

public class ZhiweibiaoController {
    @Autowired
    private ZhiweibiaoService zhiweibiaoService;
    @GetMapping  ("/selectBatchById")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selectBatchById(int bmbh){
        return AjaxResponse.success(zhiweibiaoService.selectBatchById(bmbh));
    }
    //根据部门编号添加职位
    @PostMapping("/addzhiwei")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse addzhiwei(@RequestBody Zhiweibiao zhiweibiao){
        return AjaxResponse.success(zhiweibiaoService.addzhiwei(zhiweibiao));
    }
    //根据id删除
    @DeleteMapping("/deletezhiwei")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse deletezhiwei(int zwbh){
        return AjaxResponse.success(zhiweibiaoService.deletezhiwei(zwbh));
    }
    //根据id修改
    @PostMapping("/updatezhiwei")
    @PreAuthorize("hasAnyAuthority({'/divisionManagement','/recruitmentManagement/RecruitmentPlan'})")
    public AjaxResponse updatezhiwei(@RequestBody Zhiweibiao zhiweibiao){
        return AjaxResponse.success(zhiweibiaoService.updatezhiwei(zhiweibiao));
    }
    //根据部门编号查询职位
    @GetMapping("/selZw")
    @PreAuthorize("hasAnyAuthority({'/divisionManagement','/recruitmentManagement/RecruitmentPlan'})")
    public AjaxResponse selZw(int bmbh){
        return AjaxResponse.success(zhiweibiaoService.selZw(bmbh));
    }

}

