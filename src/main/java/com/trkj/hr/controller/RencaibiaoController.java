package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.service.RencaibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import com.trkj.hr.vo.RencaiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rencaibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class RencaibiaoController {
    @Autowired
    private RencaibiaoService rencaibiaoService;
    @GetMapping("/selRc")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/TalentManagement'})")
    public AjaxResponse selRc(int pageNum,int pageSize,int rzt,String bmmc,String zwmc){
        return AjaxResponse.success(rencaibiaoService.selRc(pageNum,pageSize,rzt,bmmc,zwmc));
    }
    @DeleteMapping("/delRc")
    public AjaxResponse delRc(int rid){
        return AjaxResponse.success(rencaibiaoService.delRc(rid));
    }
    @PostMapping("/addRencai")
    @PreAuthorize("hasAuthority('/staff')")
    public AjaxResponse addRencai(@RequestBody RencaiVo rencaiVo){
        return AjaxResponse.success(rencaibiaoService.addRencai(rencaiVo));
    }
    @PutMapping("/updateRencai")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/TalentManagement'})")
    public  AjaxResponse updateRencai(@RequestBody RencaiVo rencaiVo){
        return AjaxResponse.success(rencaibiaoService.updateRencai(rencaiVo));
    }
    @PutMapping("/updateRencaizt")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement/TalentManagement'})")
    public  AjaxResponse updateRencaizt(@RequestBody RencaiVo rencaiVo){
        return AjaxResponse.success(rencaibiaoService.updateRecaizt(rencaiVo));
    }
}

