package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.vo.RencaiVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Rencaibiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface RencaibiaoService {

    IPage<RencaiVo> selRc(int pageNum,int pageSize,int rzt,String bmmc,String zwmc);

    int delRc(int rid);
//    添加人才
    int addRencai(RencaiVo rencaiVo);
    //修改人才
    int updateRencai(RencaiVo rencaiVo);
    int updateRecaizt(RencaiVo rencaiVo);
}
