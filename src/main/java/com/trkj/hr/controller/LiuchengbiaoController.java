package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengbiao;
import com.trkj.hr.service.LiuchengbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import com.trkj.hr.vo.LiuchengxxVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public  AjaxResponse updateworkzt(@RequestBody Liuchengbiao liuchengbiao){
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

    @GetMapping("/selectObjs")
    public AjaxResponse selectObjs(){
        return AjaxResponse.success(liuchengbiaoService.selectObjs());
    }

    @PostMapping("/insertxx")
    public AjaxResponse insertxx(@RequestBody Liuchengbiao liuchengbiao){
        return AjaxResponse.success(liuchengbiaoService.insertxx(liuchengbiao));
    }
}
