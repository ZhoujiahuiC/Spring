package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rizhidianpingbiao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.service.RizhidianpingbiaoService;
import com.trkj.hr.service.ZhiweibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Zhiweibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController

public class ZhiweibiaoController {
    @Autowired
    private ZhiweibiaoService zhiweibiaoService;
    @GetMapping  ("/selectBatchById")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selectBatchById(int bmbh){
        return AjaxResponse.success(zhiweibiaoService.selectBatchById(bmbh));
    }

}

