package com.trkj.hr.controller;

import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
;

/**
 * (Yuangongbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
//@RequestMapping("yuangongbiao")
public class YuangongbiaoController {
    @Autowired
    private YuangongbiaoService yuangongbiaoService;
    @GetMapping("/selectyuangong")
    public AjaxResponse selectYuangong(String yzh,String ymm){
        return AjaxResponse.success(yuangongbiaoService.selectYg(yzh,ymm));
    }

}

