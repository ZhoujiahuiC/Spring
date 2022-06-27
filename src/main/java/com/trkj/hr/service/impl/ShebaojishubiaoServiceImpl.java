package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.mapper.ShebaojishubiaoDao;
import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import com.trkj.hr.service.ShebaojishubiaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
//    @Override
//    public List<Shebaojishubiao> selAll() {
//        return shebaojishubiaoDao.selectList(null);
//    }
//分页查询缴纳项目
    @Override
    public IPage<Shebaojishubiao> selAll(int pageNum, int pageSize, String sbmc) {
        Page<Shebaojishubiao> page=new Page(pageNum,pageSize);
        QueryWrapper<Shebaojishubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("sbname",sbmc);
        IPage<Shebaojishubiao> iPage=shebaojishubiaoDao.selectPage(page,queryWrapper);
        return iPage;
    }

    //添加社保基数
    @Override
    public int addSbxm(Shebaojishubiao shebaojishubiao) {
        int i=0;
        QueryWrapper<Shebaojishubiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("sbname",shebaojishubiao.getSbname());
        Shebaojishubiao shebaojishubiao1 = shebaojishubiaoDao.selectOne(queryWrapper);
        if (shebaojishubiao1==null){
            i=shebaojishubiaoDao.insert(shebaojishubiao);
        }
        return i;
    }
//修改社保基数
    @Override
    public int upSbxm(Shebaojishubiao shebaojishubiao) {
        return shebaojishubiaoDao.updateById(shebaojishubiao);
    }

    @Override
    public int delSbxm(int sbjsbh) {
        return shebaojishubiaoDao.deleteById(sbjsbh);
    }

    @Override
    public List<Shebaojishubiao> select() {
        return shebaojishubiaoDao.selectList(null);
    }

}
