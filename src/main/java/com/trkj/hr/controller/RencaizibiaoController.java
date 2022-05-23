package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.service.RencaizibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rencaizibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class RencaizibiaoController {
    @Autowired
    private RencaizibiaoService rencaizibiaoService;
    //查询所有的部门名称
    @GetMapping("/tjnv")
    @PreAuthorize("hasAuthority('/staff')")
    public AjaxResponse tjnv(){
        return AjaxResponse.success(rencaizibiaoService.tjnv());
    }
    //修改信息
    @PostMapping("/updaterenzi")
    @PreAuthorize("hasAuthority('/staff')")
    public AjaxResponse upadate(@RequestBody Rencaizibiao rencaizibiao){
        return AjaxResponse.success(rencaizibiaoService.updaterenzi(rencaizibiao));
    }
}

