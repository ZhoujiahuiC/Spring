package com.trkj.hr.controller;

import com.trkj.hr.pojo.Mianshiguizhanzibiao;
import com.trkj.hr.service.MianshiguizhanzibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class MianshiguizhanzibiaoController {
    @Autowired
    private MianshiguizhanzibiaoService mianshiguizhanzibiaoService;
    @PostMapping("/addMsgzz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse addMsgzz(@RequestBody Mianshiguizhanzibiao mianshiguizhanzibiao){
        return AjaxResponse.success(mianshiguizhanzibiaoService.addMsgzz(mianshiguizhanzibiao));
    }
    @PutMapping("/updateMsgzz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse updateMsgzz(@RequestBody Mianshiguizhanzibiao mianshiguizhanzibiao){
        return AjaxResponse.success(mianshiguizhanzibiaoService.updateMsgzz(mianshiguizhanzibiao));
    }
    @DeleteMapping("/delMsgzz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse delMsgzz(int mzbh){
        return AjaxResponse.success(mianshiguizhanzibiaoService.delMsgzz(mzbh));
    }
}

