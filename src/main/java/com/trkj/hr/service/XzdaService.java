package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.vo.XzdaVo;
import com.trkj.hr.vo.YgcanbaoVo;

public interface XzdaService {
    IPage<XzdaVo> selPageAll(int pageNum, int pageSize, String rzname, String  bm,String  ygzt);
}
