package com.trkj.hr.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Kaoqinjilubiao;
import com.trkj.hr.service.KaoqinjilubiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * (Kaoqinjilubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class KaoqinjilubiaoController {
    @Autowired
    private KaoqinjilubiaoService kaoqinjilubiaoService;
    //添加上班打卡记录
    @PostMapping("/addkaoqin")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse add(@RequestBody  Kaoqinjilubiao kaoqinjilubiao){
        return AjaxResponse.success(kaoqinjilubiaoService.addkq(kaoqinjilubiao));
    }
    //根据当前的特殊字段查询
    @GetMapping("/selectkaoqin")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse select(String s){
        return AjaxResponse.success(kaoqinjilubiaoService.selectkaoqin( s));
    }
    //提前下班打卡修改
    @GetMapping("/updatkaoqin")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse update( String kqcx){
        return AjaxResponse.success(kaoqinjilubiaoService.updatekq(kqcx));
    }
    //正常下班打卡修改
    @GetMapping("/updatkaoqin1")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse update1( String kqcx ){
        return AjaxResponse.success(kaoqinjilubiaoService.updatekq1(kqcx));
    }
    @GetMapping("selectkq")
    @PreAuthorize("hasAuthority('/attendanceManagement')")
    public AjaxResponse selectkq(){
        return AjaxResponse.success(kaoqinjilubiaoService.selectkq());
    }
}

