package com.trkj.hr.controller;

import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
;import java.text.ParseException;

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

    @GetMapping("/selEmpSb1")
    @PreAuthorize("hasAuthority('/staffManagement')")
    public AjaxResponse selEmpSb(int pageNum,int pageSize,String rzname,String sbmc){
        System.out.println(1111111);
        log.debug("lll{}",yuangongbiaoService.selPageAllEmpSb(pageNum, pageSize,rzname,sbmc));
        System.out.println(1111111);
        return AjaxResponse.success(yuangongbiaoService.selPageAllEmpSb(pageNum, pageSize,rzname,sbmc));
    }
    @GetMapping("/selectListYg")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectListYg(int role_id){
        return AjaxResponse.success(yuangongbiaoService.selectListYg(role_id));
    }
    //    根据id修改社保编号
    @PatchMapping("/upEmpcbfa")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse upEmpcbfa( @Param("ybh") Integer ybh, @Param("sbbh") Integer sbbh){
        log.debug("ybh:{}",ybh);
        return AjaxResponse.success(yuangongbiaoService.upEmpsbfa(ybh,sbbh));
    }
    @PutMapping("/upygjbgz")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse upygjbgz(@RequestBody Yuangongbiao yuangongbiao){
        return AjaxResponse.success(yuangongbiaoService.upygjbgz(yuangongbiao));
    }

    @GetMapping("/yuangongxx")
    @PreAuthorize("hasAuthority('/authorityManagement')")
    public AjaxResponse selectxx(){
        return AjaxResponse.success(yuangongbiaoService.selectxx());
    }

    @GetMapping("/selYb")
    @PreAuthorize("hasAnyAuthority({'/attendanceManagement/MonthlyAttendanceReport'})")
    public AjaxResponse selYb(int pageNum, int pageSize) throws ParseException {
        return AjaxResponse.success(yuangongbiaoService.selYb(pageNum,pageSize));
    }

    @GetMapping("/selectxxId")
    public AjaxResponse selectxxId(int ybh){
        return AjaxResponse.success(yuangongbiaoService.selectxxId(ybh));
    }

    @GetMapping("/selectx1Id")
    public AjaxResponse selectx1Id(int ybh){
        return AjaxResponse.success(yuangongbiaoService.selectx1Id(ybh));
    }

    @GetMapping("/selectx2Id")
    public AjaxResponse selectx2Id(int bmbh,int ybh){
        return AjaxResponse.success(yuangongbiaoService.selectx2Id(bmbh,ybh));
    }
}

