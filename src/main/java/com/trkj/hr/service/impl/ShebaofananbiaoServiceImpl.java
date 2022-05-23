package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.SbzjbDao;
import com.trkj.hr.mapper.ShebaojishubiaoDao;
import com.trkj.hr.pojo.Sbzjb;
import com.trkj.hr.pojo.Shebaofananbiao;
import com.trkj.hr.mapper.ShebaofananbiaoDao;
import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.service.ShebaofananbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (Shebaofananbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("shebaofananbiaoService")
public class ShebaofananbiaoServiceImpl implements ShebaofananbiaoService {
    @Autowired
   private ShebaofananbiaoDao shebaofananbiaoDao;
    @Autowired
    private ShebaojishubiaoDao shebaojishubiaoDao;
    @Autowired
    private SbzjbDao sbzjbDao;
    //    社保方案查询所有
    @Override
    public List<Shebaofananbiao> selectAll() {
        return shebaofananbiaoDao.selectList(null);
    }
    //分页查询
    @Override
    public IPage<Shebaofananbiao> page(int pageNum, int pageSize) {
        IPage<Shebaofananbiao> page = new Page(pageNum,pageSize);
        return shebaofananbiaoDao.selectPage(page,null);
    }


    //    社保添加
    @Override
    public int addSb(Shebaofananbiao shebaofananbiao) {
        return shebaofananbiaoDao.insert(shebaofananbiao);
    }

    //社保方案单个删除
    @Override
    public int deleteById(int sbbh) {
        return shebaofananbiaoDao.delectbyid(sbbh);
    }
    //批量删除社保方案
    @Override
    public int BatchDel(List<Integer> ids) {
        return shebaofananbiaoDao.deleteBatchIds(ids);
    }



    //模糊查询社保方案
    @Override
    public IPage<Shebaofananbiao> selectlike(int pageNum,int pageSize,String name) {
        Page<Shebaofananbiao> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Shebaofananbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("sbmc","%"+name+"%");
        IPage<Shebaofananbiao> shebaofananbiaoList = shebaofananbiaoDao.selectPage(page,queryWrapper);
        return shebaofananbiaoList;
    }
//    添加社保方案2
    @Override
    public int addSbfan(Shebaofananbiao shebaofananbiao) {
            Shebaofananbiao sbfa=new Shebaofananbiao();
            sbfa.setSbmc(shebaofananbiao.getSbmc());
            int insert=shebaofananbiaoDao.insert(sbfa);
            List<Shebaojishubiao> qbsj=shebaofananbiao.getJs();
            for (Shebaojishubiao obj :qbsj){
                Sbzjb sbzjb=new Sbzjb();
                sbzjb.setSbbh(sbfa.getSbbh());
                sbzjb.setSbjsbh(obj.getSbjsbh());
                insert = sbzjbDao.insert(sbzjb);
            }
            return 1;
    }



    @Override
    public Shebaofananbiao selSbxq1(int sbbh) {

        Shebaofananbiao shebaofananbiao = shebaofananbiaoDao.selectById(sbbh);
        System.out.println(shebaofananbiao);
        System.out.println(shebaofananbiao.getSbbh());
        QueryWrapper<Sbzjb> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("sbbh",shebaofananbiao.getSbbh());
        List<Sbzjb> sbzjbs = sbzjbDao.selectList(queryWrapper);
        System.out.println("sbzjbs"+sbzjbs);
        List<Shebaojishubiao> list=new ArrayList<>();
        int i=0;
        for (Sbzjb s :sbzjbs) {
            System.out.println("s.getSbjsbh():"+s.getSbjsbh()+"s.getSbbh():"+s.getSbbh());
            Shebaojishubiao shebaojishubiao = shebaojishubiaoDao.selectById(s.getSbjsbh());
            System.out.println("shebaojishubiao:"+shebaojishubiao);
            list.add(i,shebaojishubiao);
            System.out.println("list:"+list);
            i++;
        }
        shebaofananbiao.setJs(list);
        return shebaofananbiao;
    }
}