package com.trkj.hr.controller;

import com.trkj.hr.pojo.Bancibiao;
import com.trkj.hr.service.BancibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class BancibiaoController {
    @Autowired
    private BancibiaoService bancibiaoService;

    @GetMapping("/selBc")
    @PreAuthorize("hasAnyAuthority({'/attendanceManagement/RosterSetting'})")
    public AjaxResponse selBc(){
        return AjaxResponse.success(bancibiaoService.selBc());
    }
    @PostMapping("/intBc")
    @PreAuthorize("hasAnyAuthority({'/attendanceManagement/RosterSetting'})")
    public AjaxResponse intBc(@RequestBody Bancibiao bancibiao){
        return AjaxResponse.success(bancibiaoService.intBc(bancibiao));
    }
    @PutMapping("/upBc")
    @PreAuthorize("hasAnyAuthority({'/attendanceManagement/RosterSetting'})")
    public AjaxResponse upBc(@RequestBody Bancibiao bancibiao){
        return  AjaxResponse.success(bancibiaoService.upBc(bancibiao));
    }
    @DeleteMapping("/delBc")
    @PreAuthorize("hasAnyAuthority({'/attendanceManagement/RosterSetting'})")
    public AjaxResponse delBc(int bcbh){
        return  AjaxResponse.success(bancibiaoService.delBc(bcbh));
    }
}
