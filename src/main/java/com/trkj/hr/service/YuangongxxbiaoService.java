package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.pojo.ygxxbiao;
import org.springframework.data.domain.Page;

import java.util.List;

public interface YuangongxxbiaoService {
    //根据id查询个人信息
    List<ygxxbiao> selctyuangongbiao(int ybh);
    //分页查询员工信息可根据name模糊查询
    IPage<ygxxbiao> selctyuangongguanli(int pageNum, int pageSize,String rzname);
    //根据员工状态查询
    IPage<ygxxbiao> selectygzt(int pageNum, int pageSize,int ygzt);
}
