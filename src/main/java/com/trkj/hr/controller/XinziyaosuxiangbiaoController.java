package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import com.trkj.hr.service.XinziyaosuxiangbiaoService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Xinziyaosuxiangbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@Slf4j
public class XinziyaosuxiangbiaoController {
    @Autowired
    private XinziyaosuxiangbiaoService xinziyaosuxiangbiaoService;
//    查询所有薪资要素项
    @GetMapping("/selAllxzys")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse selAllxzys(int pageNum,int pageSize,String xzysmc){
        return AjaxResponse.success(xinziyaosuxiangbiaoService.selAllxzys(pageNum, pageSize, xzysmc));
    }
    @PutMapping("/upAllxzys")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse upAllxzys(@RequestBody  List<Xinziyaosuxiangbiao> list){
        log.debug("list:{}",list);
        return AjaxResponse.success(xinziyaosuxiangbiaoService.upxzysje(list));
    }
//    添加薪资要素项
    @PostMapping("/addxzysx")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse addxzysx(@RequestBody Xinziyaosuxiangbiao xzysx){
        return AjaxResponse.success(xinziyaosuxiangbiaoService.addxzysx(xzysx));
    }
//    修改单个薪资要素项金额
    @PutMapping("/upxzysxje")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse upxzysxje(@RequestBody Xinziyaosuxiangbiao xinziyaosuxiangbiao){
        return AjaxResponse.success(xinziyaosuxiangbiaoService.upxzysxje2(xinziyaosuxiangbiao));
    }
//    删除薪资要素项
    @DeleteMapping("/delxzysx")
    @PreAuthorize("hasAuthority('/divisionManagement')")
    public AjaxResponse delxzysx(int xzysbh){
        return AjaxResponse.success(xinziyaosuxiangbiaoService.delxzysx(xzysbh));
    }
}