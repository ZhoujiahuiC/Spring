package com.trkj.hr.controller;

import com.trkj.hr.pojo.Gonggaobiao;
import com.trkj.hr.service.GonggaobiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Gonggaobiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class GonggaobiaoController {
    @Autowired
    private GonggaobiaoService gonggaobiaoService;
    //添加公告
    @PostMapping("addgonggao")
    public AjaxResponse addgg(@RequestBody Gonggaobiao gonggaobiao){
        return AjaxResponse.success(gonggaobiaoService.addgg(gonggaobiao));
    }
    //分页查询公告
    @GetMapping("selectgg")
    public AjaxResponse selectgg(int pageNum, int pageSize){
        return AjaxResponse.success(gonggaobiaoService.selectgg(pageNum,pageSize));
    }
}

