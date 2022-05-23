package com.trkj.hr.controller;

import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin
public class dlController {
    @Autowired
    private YuangongbiaoService yuangongbiaoService;
    @PostMapping("/selectYuanGong")
    public AjaxResponse selectYuangong(@RequestBody Yuangongbiao yuangongbiao){
        return yuangongbiaoService.selectYg(yuangongbiao);
    }
}
