package com.trkj.hr.controller;

import com.trkj.hr.pojo.Nashuibiao;
import com.trkj.hr.service.NashuibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Nashuibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class NashuibiaoController {
    @Autowired
    private NashuibiaoService nashuibiaoService;
    @GetMapping("/selNashui")
    public AjaxResponse selNashui(){
        return AjaxResponse.success(nashuibiaoService.nashuiList());
    }
    @PostMapping("/addNashui")
    public AjaxResponse addNashui(@RequestBody Nashuibiao nashuibiao){
        return AjaxResponse.success(nashuibiaoService.addnashui(nashuibiao));
    }
    @DeleteMapping("/delNashui")
    public AjaxResponse delNashui( int nsbbh){
        return AjaxResponse.success(nashuibiaoService.delnashui(nsbbh));
    }
    @PutMapping("/upNashui")
    public AjaxResponse upNashui(@RequestBody Nashuibiao nashuibiao){
        return AjaxResponse.success(nashuibiaoService.upnashui(nashuibiao));
    }
}

