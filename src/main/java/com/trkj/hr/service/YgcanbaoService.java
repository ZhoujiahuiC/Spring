package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.vo.YgcanbaoVo;


import java.util.List;

public interface YgcanbaoService {
    List<YgcanbaoVo> selOneYgcb(int ybh);
//    查询所有参保人员
    IPage<YgcanbaoVo> selPageAllEmpSb(int pageNum, int pageSize, String rzname, String sbmc);
//    修改员工是否参保
    int updateIscb(List<Yuangongbiao> voList);

//    查询未参保的正式员工
    List<YgcanbaoVo> nocbyg();
//    添加员工参保
    int upEmpcb(List<Integer> voList);

}
