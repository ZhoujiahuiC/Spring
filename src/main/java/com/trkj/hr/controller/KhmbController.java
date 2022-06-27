package com.trkj.hr.controller;

import com.trkj.hr.pojo.Khmb;
import com.trkj.hr.service.KhService;
import com.trkj.hr.service.KhmbService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class KhmbController {
    @Autowired
    private KhmbService khmbService;
    @GetMapping("/khmbs")
    public AjaxResponse khmbs(){
        return AjaxResponse.success(khmbService.khmns());
    }
    @GetMapping("/khmbObjs")
    public AjaxResponse khmbObjs(){
        return AjaxResponse.success(khmbService.khmbObjs());
    }
    @PostMapping("/insertkhmb")
    public AjaxResponse insertkhmb(@RequestBody Khmb khmb){
        return AjaxResponse.success(khmbService.insertkhmb(khmb));
    }

    @GetMapping("/deletekhmb")
    public AjaxResponse deletekhmb(Integer khmbid){
        return AjaxResponse.success(khmbService.deletekhmb(khmbid));
    }
}
