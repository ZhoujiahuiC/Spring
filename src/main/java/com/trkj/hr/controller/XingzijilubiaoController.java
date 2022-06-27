package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xingzijilubiao;
import com.trkj.hr.service.XingzijilubiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xingzijilubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
public class XingzijilubiaoController {
    @Autowired
    private XingzijilubiaoService xingzijilubiaoService;
    @GetMapping("/selAllxzjl")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selAllxzjl(){
        return AjaxResponse.success(xingzijilubiaoService.selAllxzjl());
    }
}