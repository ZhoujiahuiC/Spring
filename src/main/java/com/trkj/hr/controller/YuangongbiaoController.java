package com.trkj.hr.controller;

import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
;

/**
 * (Yuangongbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@Slf4j
//@RequestMapping("yuangongbiao")
public class YuangongbiaoController {
    @Autowired
    private YuangongbiaoService yuangongbiaoService;
    //统计员工状态各人数
    @GetMapping("/tongjiygzt")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse tongji(){
        return AjaxResponse.success(yuangongbiaoService.tongji());
    }
    //根据id修改员工状态
    @GetMapping("/updateygzt")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public  AjaxResponse updateygzt( int ybh){
        return AjaxResponse.success(yuangongbiaoService.updateygzt(ybh));
    }

    @GetMapping("/selEmpSb")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse selEmpSb(int pageNum,int pageSize,String rzname,String sbmc){
        System.out.println(1111111);
        log.debug("lll{}",yuangongbiaoService.selPageAllEmpSb(pageNum, pageSize,rzname,sbmc));
        System.out.println(1111111);
        return AjaxResponse.success(yuangongbiaoService.selPageAllEmpSb(pageNum, pageSize,rzname,sbmc));
    }
}

