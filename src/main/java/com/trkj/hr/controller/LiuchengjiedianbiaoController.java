package com.trkj.hr.controller;

import com.trkj.hr.service.LiuchengjiedianbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiuchengjiedianbiaoController {
    @Autowired
    private LiuchengjiedianbiaoService liuchengjiedianbiaoService;
    @GetMapping("/liuchengjiedianbiao")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(liuchengjiedianbiaoService.jiedianbiao());
    }
}
