package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jixiaodinjibiao;
import com.trkj.hr.service.JixiaodinjibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Jixiaodinjibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
//@CrossOrigin
public class JixiaodinjibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JixiaodinjibiaoService jixiaodinjibiaoService;
//    查询所有绩效顶级
   @GetMapping("/selectJixiao")
   @PreAuthorize("hasAnyAuthority('/performanceManagement')")
    public AjaxResponse selectJixiao(){
       return AjaxResponse.success(jixiaodinjibiaoService.selectAllJixiao());
   }
//   添加绩效定级方法
    @PostMapping("/addJixiaodinji")
    @PreAuthorize("hasAnyAuthority('/performanceManagement')")
    public AjaxResponse addJixiaodinji(@RequestBody Jixiaodinjibiao jixiaodinjibiao){
       return AjaxResponse.success(jixiaodinjibiaoService.addJixiaodinji(jixiaodinjibiao));
    }
//    修改绩效定级方法
    @PutMapping("/upJixiaodinji")
    @PreAuthorize("hasAnyAuthority('/performanceManagement')")
    public AjaxResponse upJixiaodinji(@RequestBody Jixiaodinjibiao jixiaodinjibiao){
       return AjaxResponse.success(jixiaodinjibiaoService.updateJixiaodinji(jixiaodinjibiao));
    }
//绩效定级删除多个方法
    @PostMapping("/delectMany")
    @PreAuthorize("hasAnyAuthority('/performanceManagement')")
    public AjaxResponse delectMany( @RequestBody List<Integer> ids){
       return AjaxResponse.success(jixiaodinjibiaoService.deleteJixiao(ids));
    }
//     绩效定级删除单个
    @DeleteMapping("/deleteOne/{jdbh}")
    @PreAuthorize("hasAnyAuthority('/performanceManagement')")
    public AjaxResponse deleteOne(@PathVariable Integer jdbh){
       return AjaxResponse.success(jixiaodinjibiaoService.deleteOne(jdbh));
    }
}

