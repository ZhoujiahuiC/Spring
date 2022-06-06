package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinzijiluzibiao;
import com.trkj.hr.service.XinzijiluzibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinzijiluzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
public class XinzijiluzibiaoController {
    @Autowired
    private XinzijiluzibiaoService xinzijiluzibiaoService;
    @GetMapping("selectxinzi")
    @PreAuthorize("hasAuthority('/salaryAdministration')")
    public AjaxResponse selectxinzi(int pageNum, int pageSize, int ybh){
        return AjaxResponse.success(xinzijiluzibiaoService.selectxinzi(pageNum,pageSize,ybh));
    }
}