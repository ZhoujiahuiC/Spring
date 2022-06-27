package com.trkj.hr.service.impl;

import com.trkj.hr.pojo.Nashuibiao;
import com.trkj.hr.mapper.NashuibiaoDao;
import com.trkj.hr.service.NashuibiaoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Nashuibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("nashuibiaoService")
public class NashuibiaoServiceImpl implements NashuibiaoService {
    @Resource
    private NashuibiaoDao nashuibiaoDao;
    @Override
    public List<Nashuibiao> nashuiList() {
        return nashuibiaoDao.selectList(null) ;
    }

    @Override
    public int addnashui(Nashuibiao nashuibiao) {
        return nashuibiaoDao.insert(nashuibiao);
    }

    @Override
    public int delnashui(int nsbbh) {
        return nashuibiaoDao.deleteById(nsbbh);
    }

    @Override
    public int upnashui(Nashuibiao nashuibiao) {
        return nashuibiaoDao.updateById(nashuibiao);
    }
}
