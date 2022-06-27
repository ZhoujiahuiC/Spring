package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shenhetijiaobiao;
import com.trkj.hr.service.ShenhetijiaobiaoService;
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
public class ShenhetijiaobiaoController {
    @Autowired
    private ShenhetijiaobiaoService shenhetijiaobiaoService;
    @PostMapping("/Shenhetianjia")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse addtianjia(@RequestBody Shenhetijiaobiao shenhetijiaobiao){
        return AjaxResponse.success(shenhetijiaobiaoService.inserttianjia(shenhetijiaobiao));
    }

    @GetMapping("/selectyewu")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selectyewu(int businessid){
        return AjaxResponse.success(shenhetijiaobiaoService.selectyewu(businessid));
    }
}

