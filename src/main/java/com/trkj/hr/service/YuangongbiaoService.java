package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.vo.AjaxResponse;
import com.trkj.hr.vo.YuangonVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Yuangongbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface YuangongbiaoService {
 AjaxResponse selectYg(Yuangongbiao yuangongbiao);

 //统计员工状态各人数
 List<Yuangongbiao> tongji();
 //根据id修改员工状态
 int updateygzt(int ybh);
 IPage<YuangonVo> selPageAllEmpSb(int pageNum, int pageSize, String rzname, String sbmc);
 List<Yuangongbiao> selectListYg(int role_id);
 //    查询所有员工社保信息
//    List<YuangonVo> selectAllEmpSb();

 //修改员工参保方案
 int upEmpsbfa(@Param("ybh") Integer ybh, @Param("sbbh") Integer sbbh);

}
