package com.trkj.hr.controller;

import com.trkj.hr.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dlController {
    @GetMapping("/todl")
    public String toDl(){
        return "todl";
    }
    @PostMapping("/zy")
    public AjaxResponse toZy(){
        return AjaxResponse.success("zy");
    }
}
