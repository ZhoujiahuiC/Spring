package com.trkj.hr.controller;

import com.trkj.hr.service.YgcanbaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class YgcanbaoController {
    @Autowired
    private YgcanbaoService ygcanbaoService;
    @GetMapping("/selYgcb/{ybh}")
    public AjaxResponse selYgcb(@PathVariable int ybh){
        return AjaxResponse.success(ygcanbaoService.selOneYgcb(ybh));
    }
}
