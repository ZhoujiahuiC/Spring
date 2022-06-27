package com.trkj.hr.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YgcanbaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class YgcanbaoController {
    @Autowired
    private YgcanbaoService ygcanbaoService;
    @PreAuthorize("hasAuthority('/divisionManagement')")
    @GetMapping("/selYgcb")
    public AjaxResponse selYgcb(int ybh){
        return AjaxResponse.success(ygcanbaoService.selOneYgcb(ybh));
    }
//   查询参保人员
    @GetMapping("/selEmpSb")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selEmpSb(int pageNum,int pageSize,String rzname,String sbmc){
        return AjaxResponse.success(ygcanbaoService.selPageAllEmpSb(pageNum, pageSize,rzname,sbmc));
    }
//    批量修改是否参保
    @PutMapping("/upIscb")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse upIscb( @RequestBody List<Yuangongbiao> multipleSelection){
        log.debug("xxxygcanbaovos:{}",multipleSelection);
        return AjaxResponse.success(ygcanbaoService.updateIscb(multipleSelection));
    }
//    条件查询停保人员
//    @GetMapping("/selNoyg")
//    public AjaxResponse selNoyg(){
//        return AjaxResponse.success(ygcanbaoService.selTbyg());
//    }
    @GetMapping("/nocbyg")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse nocbyg(){
        return AjaxResponse.success(ygcanbaoService.nocbyg());
    }
//    添加员工参保
    @PutMapping("/addEmpcb")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse addEmpcb(@RequestBody List<Integer> canbao){
        log.debug("canbao:{}",canbao);
        return AjaxResponse.success(ygcanbaoService.upEmpcb(canbao));
    }

}
