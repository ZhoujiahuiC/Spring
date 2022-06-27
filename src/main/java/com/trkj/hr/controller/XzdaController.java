package com.trkj.hr.controller;

import com.trkj.hr.service.XzdaService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class XzdaController {
    @Resource
    private XzdaService xzdaService;
//    分页条件查询薪资档案
    @GetMapping("/selPageAll")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selPageAll(int pageNum,int pageSize,String rzname,String bmmc,String  ygzt){
        return AjaxResponse.success(xzdaService.selPageAll(pageNum, pageSize,rzname,bmmc,ygzt));
    }

}
