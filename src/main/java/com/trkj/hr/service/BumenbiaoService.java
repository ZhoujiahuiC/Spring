package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.vo.BumenJbgzb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Bumenbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:13
 */
public interface BumenbiaoService {
        //分页查询部门
        IPage<Bumenbiao> selectdept(int pageNum,int pageSize,String name);
        //添加部门
        int adddept(Bumenbiao bumenbiao);
        //删除部门
        int deletedept(int bmbh);
        //修改部门
        int updatedept(Bumenbiao bumenbiao);
        List<Bumenbiao> selDept();
//        查询所有部门
        List<Bumenbiao> selBumen();

        List<Bumenbiao> selectbmmc();
        List<Bumenbiao> selAll();
        //        查询所有部门
        List<Bumenbiao> selBumen2();
}
