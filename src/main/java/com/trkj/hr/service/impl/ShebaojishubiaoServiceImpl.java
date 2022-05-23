package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.mapper.ShebaojishubiaoDao;
import com.trkj.hr.service.ShebaofananbiaoService;
import com.trkj.hr.service.ShebaojishubiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shebaojishubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shebaojishubiaoService")
public class ShebaojishubiaoServiceImpl implements ShebaojishubiaoService {
    @Autowired
    private ShebaojishubiaoDao shebaojishubiaoDao;

//    查询缴纳项目
    @Override
    public List<Shebaojishubiao> selAll() {
        return shebaojishubiaoDao.selectList(null);
    }
//添加社保基数
    @Override
    public int addSbxm(Shebaojishubiao shebaojishubiao) {
        return shebaojishubiaoDao.insert(shebaojishubiao);
    }

    @Override
    public int upSbxm(Shebaojishubiao shebaojishubiao) {
        return shebaojishubiaoDao.updateById(shebaojishubiao);
    }

}
