package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.trkj.hr.pojo.Mianshiguizhanbiao;
import com.trkj.hr.vo.MianshiguizhanbiaoVo;
import com.trkj.hr.vo.MsgzVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Mianshiguizhanbiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface MianshiguizhanbiaoService {

    List<Mianshiguizhanbiao> selMsgz(int pageNum, int pageSize, String zwmc, String mmc);

    int updateMsgz(Mianshiguizhanbiao mianshiguizhanbiao);

    int delMsgz(int mbh);

    int addMsgz(MsgzVo msgzVo);
}
