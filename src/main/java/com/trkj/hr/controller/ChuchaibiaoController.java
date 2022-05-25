package com.trkj.hr.controller;

import com.trkj.hr.pojo.Chuchaibiao;
import com.trkj.hr.service.ChuchaibiaoService;
import com.trkj.hr.vo.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Chuchaibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
public class ChuchaibiaoController {
    @Autowired
    private ChuchaibiaoService chuchaibiaoService;
    @GetMapping("/selectchuchai")
    public AjaxResponse selectchuchai(int pageNum, int pageSize, int ybh){
        return AjaxResponse.success(chuchaibiaoService.selectchuchai(pageNum,pageSize,ybh));
    }

}

