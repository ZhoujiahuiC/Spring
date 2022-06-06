package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.service.LiuchengbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
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
    @GetMapping("/liuchengxx")
    public AjaxResponse selectxx(int workid){
        return AjaxResponse.success(liuchengbiaoService.selectxx(workid));
    }

    @GetMapping("/selectliu")
    public AjaxResponse selectliu(String workname){
        return AjaxResponse.success(liuchengbiaoService.selectliu(workname));
    }

    @GetMapping("/deleteById")
    public AjaxResponse deleteById(int workid){
        return AjaxResponse.success(liuchengbiaoService.deleteById(workid));
    }

}
