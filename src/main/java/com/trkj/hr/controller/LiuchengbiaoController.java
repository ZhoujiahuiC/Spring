package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.service.LiuchengbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiuchengbiaoController {
    @Autowired
    private LiuchengbiaoService liuchengbiaoService;
    @GetMapping("/liuchengbiao")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(liuchengbiaoService.liuchengbiaos());
    }
    @PutMapping("/updateworkzt")
    public AjaxResponse updateworkzt(@RequestBody Liuchengbiao liuchengbiao){
        return AjaxResponse.success(liuchengbiaoService.updateworkzt(liuchengbiao));
    }
}
