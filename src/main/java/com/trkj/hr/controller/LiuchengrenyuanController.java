package com.trkj.hr.controller;

import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.pojo.Liuchengrenyuan;
import com.trkj.hr.service.LiuchengrenyuanService;
import com.trkj.hr.vo.AjaxResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiuchengrenyuanController {
    @Autowired
    private LiuchengrenyuanService liuchengrenyuanService;
    @GetMapping("/liuchengrenyuan")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(liuchengrenyuanService.renyuan());
    }


}
