package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.service.XinzijibengongzibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinzijibengongzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@Slf4j
public class XinzijibengongzibiaoController {
    @Autowired
    private XinzijibengongzibiaoService xinzijibengongzibiaoService;
    //       分页条件查询所有部门职位的基本工资
    @GetMapping("/selAllOfjbxz")
    @PreAuthorize("hasAuthority('/salaryAdministration')")
    public AjaxResponse selAllOfjbxz(Integer pageNum,Integer pageSize,String bmmc,String zwmc){
        return AjaxResponse.success(xinzijibengongzibiaoService.selAllOfjbgz(pageNum, pageSize, bmmc, zwmc));
    }
    @PutMapping("/upjbxz")
    @PreAuthorize("hasAuthority('/salaryAdministration')")
    public AjaxResponse upjbxz(@RequestBody Xinzijibengongzibiao x){
        return AjaxResponse.success(xinzijibengongzibiaoService.upjbxz(x));
    }
    @PostMapping("/addjbxz")
    @PreAuthorize("hasAuthority('/salaryAdministration')")
    public AjaxResponse addjbxz( int zwbh, Double xzjbxz ){
        return AjaxResponse.success(xinzijibengongzibiaoService.addjbxz(zwbh, xzjbxz));
    }
}
