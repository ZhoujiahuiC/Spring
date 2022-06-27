package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengyewu;
import com.trkj.hr.service.LiuchengyewuService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LiuchengyewuController {
    @Autowired
    private LiuchengyewuService liuchengyewuService;

    @GetMapping("/selectyewuxx")
    public AjaxResponse selectyewuxx(Integer ybh){
        return AjaxResponse.success(liuchengyewuService.selectyewuxx(ybh));
    }

    @GetMapping("/selectObjsyw")
    public AjaxResponse selectObjsyw(){
        return AjaxResponse.success(liuchengyewuService.selectObjsyw());
    }

    @PostMapping("/insertyw")
    public AjaxResponse insertyw (@RequestBody Liuchengyewu liuchengyewu){
        return AjaxResponse.success(liuchengyewuService.insertyw(liuchengyewu));
    }

    @GetMapping("/selectcountyw")
    public AjaxResponse selectcountyw (Integer businessid,Integer workid){
        return AjaxResponse.success(liuchengyewuService.selectcountyw(businessid,workid));
    }
}
