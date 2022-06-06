package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.vo.BumenJbgzb;
import com.trkj.hr.vo.YgcanbaoVo;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Xinzijibengongzibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface XinzijibengongzibiaoService {
    //    分页条件查询所有部门职位的基本工资
    IPage<BumenJbgzb> selAllOfjbgz(Integer pageNum, Integer pageSize, String bmmc, String zwmc);
    //    修改职位基本工资
    int upjbxz( Xinzijibengongzibiao xinzijibengongzibiao);
    // 添加基本工资
    int addjbxz(int zwbh,Double xzjbxz);
}
