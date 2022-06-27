package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.service.LiuchengjiedianbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class LiuchengjiedianbiaoController {
    @Autowired
    private LiuchengjiedianbiaoService liuchengjiedianbiaoService;

    @GetMapping("/liuchengjiedianbiao")
    public AjaxResponse jiedianxx(int workid){
        return AjaxResponse.success(liuchengjiedianbiaoService.jiedianxx(workid));
    }

    @PutMapping("/liuchengjieupdataxx")
    @PreAuthorize("hasAnyAuthority({'/examineManagement/ShenPi3'})")
    public AjaxResponse updataxx(@RequestBody Liuchengjiedianbiao liuchengjiedianbiao){
        return AjaxResponse.success(liuchengjiedianbiaoService.updataxx(liuchengjiedianbiao));
    }

    @GetMapping("/deletejie")
    public AjaxResponse deleteById(Integer nodeid){
        return AjaxResponse.success(liuchengjiedianbiaoService.deletexx(nodeid));
    }

    @GetMapping("/selectjieObjs")
    public AjaxResponse selectObjs(){
        return AjaxResponse.success(liuchengjiedianbiaoService.selectjieObjs());
    }

    @PostMapping("/insertjiex1")
    public AjaxResponse insertxx(@RequestBody Liuchengjiedianbiao liuchengjiedianbiao){
        return AjaxResponse.success(liuchengjiedianbiaoService.insertxx(liuchengjiedianbiao));
    }

    @PostMapping("/saveBatch")
    public AjaxResponse saveBatch(@RequestBody List<Liuchengjiedianbiao> formData2){
        log.debug("formdate2:{}",formData2);
        boolean flag=false;
        for (Liuchengjiedianbiao s : formData2){
            flag = liuchengjiedianbiaoService.insertxx2(s);
        }
        if (flag){
            return AjaxResponse.success("上传成功");
        }else {
            return AjaxResponse.success("上传失败");
        }
    }
}
