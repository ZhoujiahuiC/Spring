package com.trkj.hr.controller;

import com.trkj.hr.pojo.Kh;
import com.trkj.hr.service.KhService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class KhController {
    @Autowired
    private KhService khService;

    @GetMapping("/selectKh0")
    public AjaxResponse selectKh0(int khybh){
        return AjaxResponse.success(khService.selectKh0(khybh));
    }

    @GetMapping("/selectObjskh")
    public AjaxResponse selectObjskh(){
        return AjaxResponse.success(khService.selectObjskh());
    }

    @PostMapping("/insertxxkh")
    public AjaxResponse insertxxkh(@RequestBody Kh kh){
        return AjaxResponse.success(khService.insertxxkh(kh));
    }

    @PutMapping("/updatakh")
    public AjaxResponse updatakh (@RequestBody Kh kh){
        return AjaxResponse.success(khService.updatakh(kh));
    }

    @GetMapping("/selectKh1")
    public AjaxResponse selectKh1(int khybh){
        return AjaxResponse.success(khService.selectKh1(khybh));
    }

    @GetMapping("/selectKh2")
    public AjaxResponse selectKh2(int ybh){
        return AjaxResponse.success(khService.selectKh2(ybh));
    }

    @GetMapping("/selectKh3")
    public AjaxResponse selectKh3(int ybh){
        return AjaxResponse.success(khService.selectKh3(ybh));
    }

    @GetMapping("/selectKh4")
    public AjaxResponse selectKh4(int khid){
        return AjaxResponse.success(khService.selectkh4(khid));
    }
}
