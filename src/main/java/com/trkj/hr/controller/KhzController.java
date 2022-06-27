package com.trkj.hr.controller;

import com.trkj.hr.pojo.Khz;
import com.trkj.hr.pojo.Liuchengjiedianbiao;
import com.trkj.hr.service.KhService;
import com.trkj.hr.service.KhzService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class KhzController {
    @Autowired
    public KhzService khzService;

    @PostMapping("/insertkhzs")
    public AjaxResponse insertkhzs (@RequestBody List<Khz> addData3){
        boolean flag = false;
        for (Khz k : addData3){
            flag = khzService.insertkhzs(k);
        }
        if (flag){
            return AjaxResponse.success("上传成功");
        }else {
            return AjaxResponse.success("上传失败");
        }
    }

    @GetMapping("/khzObjs")
    public AjaxResponse khzObjs () {
        return AjaxResponse.success(khzService.khzObjs());
    }

    @PostMapping("/updatakhz")
    public AjaxResponse updatakhz (@RequestBody List<Khz> formData){
        return AjaxResponse.success(khzService.updatakhz(formData));
    }

    @GetMapping("/khzxxs")
    public AjaxResponse khzxxs (int khid){
        return AjaxResponse.success(khzService.khzxxs(khid));
    }
}
