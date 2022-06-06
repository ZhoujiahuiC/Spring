package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.LiuchengrenyuanDao;
import com.trkj.hr.pojo.Liuchengrenyuan;
import com.trkj.hr.service.LiuchengrenyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("liuchengrenyuanService")
public class LiuchengrenyuanServiceImpl implements LiuchengrenyuanService {
    @Autowired
    private LiuchengrenyuanDao liuchengrenyuanDao;
    @Override
    public List<Liuchengrenyuan> renyuan(){
        return liuchengrenyuanDao.selectList(null);
    }

    @Override
    public int updataxx(Integer ybh ,Integer nodeid) {
        Liuchengrenyuan liuchengrenyuan = new Liuchengrenyuan();
        System.out.println(ybh);
        System.out.println(nodeid);
        liuchengrenyuan.setYbh(ybh);
        liuchengrenyuan.setNodeid(nodeid);
        return liuchengrenyuanDao.updateById(liuchengrenyuan);

//        LambdaUpdateWrapper<Liuchengrenyuan> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();

    }
}
