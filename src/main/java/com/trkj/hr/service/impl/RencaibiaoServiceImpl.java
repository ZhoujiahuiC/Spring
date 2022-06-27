package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.RencaizibiaoDao;
import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.mapper.RencaibiaoDao;
import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.service.RencaibiaoService;
import com.trkj.hr.vo.RencaiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * (Rencaibiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("rencaibiaoService")
public class RencaibiaoServiceImpl implements RencaibiaoService {
    @Autowired
    private RencaibiaoDao rencaibiaoDao;
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    @Override
    public IPage<RencaiVo> selRc(int pageNum, int pageSize, int rzt,String bmmc, String zwmc) {
        Page<RencaiVo> page =new Page(pageNum,pageSize);
        QueryWrapper<RencaiVo> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.bmmc",bmmc).and(e->e.like("z.zwmc",zwmc).and(s->s.eq("rzt",rzt)));
        return rencaibiaoDao.selRc(page,queryWrapper);
    }
    @Override
    public int delRc(int rid) {
        QueryWrapper<Rencaibiao> rencaibiaoQueryWrapper=new QueryWrapper<>();
        rencaibiaoQueryWrapper.eq("rid",rid);
        Rencaibiao rencaibiao = rencaibiaoDao.selectOne(rencaibiaoQueryWrapper);
        rencaibiao.setRzt(2);
        int i = rencaibiaoDao.updateById(rencaibiao);
        return i;
    }



    @Override
    public int addRencai(RencaiVo rencaiVo) {
        int i=0;
        Rencaizibiao rencaizibiao = new Rencaizibiao();
        rencaizibiao.setRzname(rencaiVo.getRzname());
        rencaizibiao.setBmbh(rencaiVo.getBmbh());
        rencaizibiao.setRzage(rencaiVo.getRzage());
        rencaizibiao.setRzsex(rencaiVo.getRzsex());
        rencaizibiao.setRzcsrq(rencaiVo.getRzcsrq());
        rencaizibiao.setRzxl(rencaiVo.getRzxl());
        rencaizibiao.setRzsfz(rencaiVo.getRzsfz());
        rencaizibiao.setRzphone(rencaiVo.getRzphone());
        rencaizibiao.setRzdz(rencaiVo.getRzdz());
        rencaizibiao.setRzgzjl(rencaiVo.getRzgzjl());
        rencaizibiao.setRzhyzk(rencaiVo.getRzhyzk());
        rencaizibiao.setRzmz(rencaiVo.getRzmz());
        rencaizibiao.setRzzzmm(rencaiVo.getRzzzmm());
        rencaizibiao.setRzqqyx(rencaiVo.getRzqqyx());
        i=rencaizibiaoDao.insert(rencaizibiao);
        QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
        rencaizibiaoQueryWrapper.eq("rzname",rencaiVo.getRzname());
        List<Rencaizibiao> rencaizibiaos= rencaizibiaoDao.selectList(rencaizibiaoQueryWrapper);
        for (Rencaizibiao r:rencaizibiaos) {
            QueryWrapper<Rencaibiao> rencaibiaoQueryWrapper=new QueryWrapper<>();
            rencaibiaoQueryWrapper.eq("rzbh",r.getRzbh());
            Rencaibiao rencaibiao1 = rencaibiaoDao.selectOne(rencaibiaoQueryWrapper);
            if (rencaibiao1==null){
                Rencaibiao rencaibiao = new Rencaibiao();
                rencaibiao.setZwbh(rencaiVo.getZwbh());
                rencaibiao.setRzbh(r.getRzbh());
                rencaibiao.setRsf(rencaiVo.getRsf());
                rencaibiao.setRsj(new Date());
                int insert = rencaibiaoDao.insert(rencaibiao);
                if (insert>0){
                 i=i+1;
             }
            }
        }


        return  i;
    }

    @Override
    public int updateRencai(RencaiVo rencaiVo) {
        int i=0;
        Rencaibiao rencaibiao = new Rencaibiao();
        rencaibiao.setRid(rencaiVo.getRid());
        rencaibiao.setZwbh(rencaiVo.getZwbh());
        rencaibiao.setRzbh(rencaiVo.getRzbh());
        rencaibiao.setRzt(rencaiVo.getRzt());
        rencaibiao.setRsf(rencaiVo.getRsf());
        rencaibiao.setRsj(rencaiVo.getRsj());
        int i1 = rencaibiaoDao.updateById(rencaibiao);
        if (i1>0){
            i++;
        }
        Rencaizibiao rencaizibiao = new Rencaizibiao();
        rencaizibiao.setRzbh(rencaiVo.getRzbh());
        rencaizibiao.setRzname(rencaiVo.getRzname());
        rencaizibiao.setBmbh(rencaiVo.getBmbh());
        rencaizibiao.setRzsex(rencaiVo.getRzsex());
        rencaizibiao.setRzcsrq(rencaiVo.getRzcsrq());
        rencaizibiao.setRzxl(rencaiVo.getRzxl());
        rencaizibiao.setRzsfz(rencaiVo.getRzsfz());
        rencaizibiao.setRzphone(rencaiVo.getRzphone());
        rencaizibiao.setRzdz(rencaiVo.getRzdz());
        rencaizibiao.setRzgzjl(rencaiVo.getRzgzjl());
        rencaizibiao.setRzhyzk(rencaiVo.getRzhyzk());
        rencaizibiao.setRzmz(rencaiVo.getRzmz());
        rencaizibiao.setRzzzmm(rencaiVo.getRzzzmm());
        rencaizibiao.setRzqqyx(rencaiVo.getRzqqyx());
        int i2 = rencaizibiaoDao.updateById(rencaizibiao);
        if(i2>0){
            i++;
        }
        return i;
    }

    @Override
    public int updateRecaizt(RencaiVo rencaiVo) {
        Rencaibiao rencaibiao = new Rencaibiao();
        rencaibiao.setRid(rencaiVo.getRid());
        rencaibiao.setRid(rencaiVo.getRid());
        rencaibiao.setZwbh(rencaiVo.getZwbh());
        rencaibiao.setRzbh(rencaiVo.getRzbh());
        rencaibiao.setRzt(4);
        rencaibiao.setRsf(rencaiVo.getRsf());
        rencaibiao.setRsj(rencaiVo.getRsj());
        int i = rencaibiaoDao.updateById(rencaibiao);
        return i;
    }


}
