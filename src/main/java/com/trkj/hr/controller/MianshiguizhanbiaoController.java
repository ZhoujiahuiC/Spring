package com.trkj.hr.controller;

import com.trkj.hr.pojo.Mianshiguizhanbiao;
import com.trkj.hr.service.MianshiguizhanbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import com.trkj.hr.vo.MsgzVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class MianshiguizhanbiaoController {

    @Autowired
    private MianshiguizhanbiaoService mianshiguizhanbiaoService;
    @GetMapping("/selMsgz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse selMsgz(int pageNum,int pageSize,String zwmc,String mmc){
        return AjaxResponse.success(mianshiguizhanbiaoService.selMsgz(pageNum,pageSize,zwmc,mmc));
    }
    @PutMapping("/updateMsgz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse updateMsgz(@RequestBody Mianshiguizhanbiao mianshiguizhanbiao){
        return AjaxResponse.success(mianshiguizhanbiaoService.updateMsgz(mianshiguizhanbiao));
    }
    @DeleteMapping("/delMsgz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse delMsgz(int mbh){
        return AjaxResponse.success(mianshiguizhanbiaoService.delMsgz(mbh));
    }
    @PostMapping("/addMsgz")
    @PreAuthorize("hasAnyAuthority({'/recruitmentManagement'})")
    public AjaxResponse addMsgz(@RequestBody MsgzVo msgzVo){
        return AjaxResponse.success(mianshiguizhanbiaoService.addMsgz(msgzVo));
    }
}

