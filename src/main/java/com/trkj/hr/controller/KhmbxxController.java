package com.trkj.hr.controller;

import com.trkj.hr.pojo.Khmbxx;
import com.trkj.hr.service.KhmbxxService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class KhmbxxController {
    @Autowired
    private KhmbxxService khmbxxService;

    @GetMapping("/khmbxxs")
    public AjaxResponse khmbxxs(int khmbid){
        return AjaxResponse.success(khmbxxService.khmbxxs(khmbid));
    }

    @GetMapping("/khmbxxObjs")
    public AjaxResponse khmbxxObjs(){
        return AjaxResponse.success(khmbxxService.khmbxxObjs());
    }

    @PostMapping("/insertkhmbxxs")
    public AjaxResponse insertkhmbxxs (@RequestBody List<Khmbxx> formData){
        boolean flag = false;
        for (Khmbxx s : formData){
            flag = khmbxxService.insertkhmbxxs(s);
        }
        if (flag){
            return AjaxResponse.success("上传成功");
        }else {
            return AjaxResponse.success("上传失败");
        }
    }

    @GetMapping("/deletekhmbxxs")
    public AjaxResponse deletekhmbxxs (Integer khmbid){
        return AjaxResponse.success(khmbxxService.deletekhmbxxs(khmbid));
    }

    @GetMapping("/selectxxkhmbxx")
    public AjaxResponse selectxxkhmbxx () {
        return AjaxResponse.success(khmbxxService.selectxxkhmbxx());
    }
}
