package com.trkj.hr.controller;

import com.trkj.hr.service.YuangongxxbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class YuanfongxxbiaoController {
    @Autowired
    private YuangongxxbiaoService yuangongxxbiaoService;
    //根据id查询个人信息
    @GetMapping("/selectygxx")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse selectall(int ybh){
        return AjaxResponse.success(yuangongxxbiaoService.selctyuangongbiao(ybh));
    }
    //分页查询员工信息可根据name模糊查询
    @GetMapping("/selectyggl")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse selectguanli(int pageNum, int pageSize,String rzname,String bmmc, String rzxl,String ygrzrq){
        return AjaxResponse.success(yuangongxxbiaoService.selctyuangongguanli(pageNum,pageSize,rzname,bmmc,rzxl,ygrzrq));
    }
    //根据员工状态查询
    @GetMapping("/selectygzt")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse selectygzt(int pageNum, int pageSize,int ygzt, String rzname, String bmmc, String rzxl,String ygrzrq ){
        return AjaxResponse.success(yuangongxxbiaoService.selectygzt(pageNum,pageSize,ygzt,rzname,bmmc,rzxl,ygrzrq));
    }
}