package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.vo.ZhaopingjilibiaoVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Zhaopingjihuabiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
public interface ZhaopingjihuabiaoService {
    List<Bumenbiao> selZpjl(int pageNum, int pageSize, String bmmc, String zwmc);
    int addZpjl(Zhaopingjihuabiao zhaopingjihuabiao);
    int deleteZpjl(int zbh);
    int updateZpjl(Zhaopingjihuabiao zhaopingjihuabiao);
}
