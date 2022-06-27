package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Bancibiao;

import java.util.Date;
import java.util.List;

public interface BancibiaoService {
    List<Bancibiao> selBc();

    int intBc(Bancibiao bancibiao);

    int upBc(Bancibiao bancibiao);

    int delBc(int bcbh);
}
