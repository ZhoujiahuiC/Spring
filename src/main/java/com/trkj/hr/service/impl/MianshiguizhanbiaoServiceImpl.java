package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.*;
import com.trkj.hr.pojo.*;
import com.trkj.hr.service.MianshiguizhanbiaoService;
import com.trkj.hr.vo.MianshiguizhanbiaoVo;
import com.trkj.hr.vo.MsgzVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * (Mianshiguizhanbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
@Service("mianshiguizhanbiaoService")
public class MianshiguizhanbiaoServiceImpl implements MianshiguizhanbiaoService {

    @Autowired
    private MianshiguizhanbiaoDao mianshiguizhanbiaoDao;
    @Autowired
    private MianshiguizhanzibiaoDao mianshiguizhanzibiaoDao;
    @Autowired
    private ZhiweibiaoDao zhiweibiaoDao;
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Autowired
    private BumenbiaoDao bumenbiaoDao;
    @Override
    public List<Mianshiguizhanbiao> selMsgz(int pageNum, int pageSize, String zwmc, String mmc) {
        List<Mianshiguizhanbiao> mianshiguizhanbiaoList=new ArrayList<>();
        List<Mianshiguizhanbiao> mianshiguizhanbiaos=null;
        if(!zwmc.equals(null)&&mmc.equals(null)){
            mianshiguizhanbiaos = mianshiguizhanbiaoDao.selectList(null);
            for (Mianshiguizhanbiao m: mianshiguizhanbiaos) {
                m.setTotal(mianshiguizhanbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("zwbh",m.getZwbh()).and(e->e.like("zwmc",zwmc));
                Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
                if(zhiweibiao==null){
                   continue;
                }
                m.setZhiweibiao(zhiweibiao);
                QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
                bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
                Bumenbiao bumenbiao = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
                m.setBumenbiao(bumenbiao);
                QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
                yuangongbiaoQueryWrapper.eq("ybh",m.getYbh());
                Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
                m.setYuangongbiao(yuangongbiao);
                QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
                rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
                Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
                m.setRencaizibiao(rencaizibiao);
                QueryWrapper<Mianshiguizhanzibiao> mianshiguizhanzibiaoQueryWrapper=new QueryWrapper<>();
                mianshiguizhanzibiaoQueryWrapper.eq("mbh",m.getMbh());
                List<Mianshiguizhanzibiao> mianshiguizhanzibiaos = mianshiguizhanzibiaoDao.selectList(mianshiguizhanzibiaoQueryWrapper);
                if(mianshiguizhanzibiaos.size()==0){
                    break;
                }
                for (Mianshiguizhanzibiao mz: mianshiguizhanzibiaos) {
                    QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper1=new QueryWrapper<>();
                    yuangongbiaoQueryWrapper1.eq("ybh",mz.getYbh());
                    Yuangongbiao yuangongbiao1 = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper1);
                    mz.setYuangongbiao(yuangongbiao1);
                    QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper1=new QueryWrapper<>();
                    rencaizibiaoQueryWrapper1.eq("rzbh",yuangongbiao1.getRzbh());
                    Rencaizibiao rencaizibiao1 = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper1);
                    mz.setRencaizibiao(rencaizibiao1);
                    QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper1=new QueryWrapper<>();
                    zhiweibiaoQueryWrapper1.eq("zwbh",yuangongbiao1.getZwbh());
                    Zhiweibiao zhiweibiao1 = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper1);
                    mz.setZhiweibiao(zhiweibiao1);
                    QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper1=new QueryWrapper<>();
                    bumenbiaoQueryWrapper1.eq("bmbh",zhiweibiao1.getBmbh());
                    Bumenbiao bumenbiao1 = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper1);
                    mz.setBumenbiao(bumenbiao1);
                }
                m.setMianshiguizhanzibiaoList(mianshiguizhanzibiaos);
            }
            for (int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<mianshiguizhanbiaos.size()){
                    mianshiguizhanbiaoList.add(mianshiguizhanbiaos.get(i));
                }
            }
        }else if(zwmc.equals(null)&&!mmc.equals(null)){
            QueryWrapper<Mianshiguizhanbiao> mianshiguizhanbiaoQueryWrapper=new QueryWrapper<>();
            mianshiguizhanbiaoQueryWrapper.like("mmc",mmc);
            mianshiguizhanbiaos = mianshiguizhanbiaoDao.selectList(mianshiguizhanbiaoQueryWrapper);
            for (Mianshiguizhanbiao m: mianshiguizhanbiaos) {
                m.setTotal(mianshiguizhanbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("zwbh",m.getZwbh());
                Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
                m.setZhiweibiao(zhiweibiao);
                QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
                bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
                Bumenbiao bumenbiao = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
                m.setBumenbiao(bumenbiao);
                QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
                yuangongbiaoQueryWrapper.eq("ybh",m.getYbh());
                Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
                m.setYuangongbiao(yuangongbiao);
                QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
                rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
                Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
                m.setRencaizibiao(rencaizibiao);
                QueryWrapper<Mianshiguizhanzibiao> mianshiguizhanzibiaoQueryWrapper=new QueryWrapper<>();
                mianshiguizhanzibiaoQueryWrapper.eq("mbh",m.getMbh());
                List<Mianshiguizhanzibiao> mianshiguizhanzibiaos = mianshiguizhanzibiaoDao.selectList(mianshiguizhanzibiaoQueryWrapper);
                if(mianshiguizhanzibiaos.size()==0){
                    break;
                }
                for (Mianshiguizhanzibiao mz: mianshiguizhanzibiaos) {
                    QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper1=new QueryWrapper<>();
                    yuangongbiaoQueryWrapper1.eq("ybh",mz.getYbh());
                    Yuangongbiao yuangongbiao1 = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper1);
                    mz.setYuangongbiao(yuangongbiao1);
                    QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper1=new QueryWrapper<>();
                    rencaizibiaoQueryWrapper1.eq("rzbh",yuangongbiao1.getRzbh());
                    Rencaizibiao rencaizibiao1 = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper1);
                    mz.setRencaizibiao(rencaizibiao1);
                    QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper1=new QueryWrapper<>();
                    zhiweibiaoQueryWrapper1.eq("zwbh",yuangongbiao1.getZwbh());
                    Zhiweibiao zhiweibiao1 = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper1);
                    mz.setZhiweibiao(zhiweibiao1);
                    QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper1=new QueryWrapper<>();
                    bumenbiaoQueryWrapper1.eq("bmbh",zhiweibiao1.getBmbh());
                    Bumenbiao bumenbiao1 = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper1);
                    mz.setBumenbiao(bumenbiao1);
                }
                m.setMianshiguizhanzibiaoList(mianshiguizhanzibiaos);
            }
            for (int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<mianshiguizhanbiaos.size()){
                    mianshiguizhanbiaoList.add(mianshiguizhanbiaos.get(i));
                }
            }
        }else if(!zwmc.equals(null)&&!mmc.equals(null)){
            QueryWrapper<Mianshiguizhanbiao> mianshiguizhanbiaoQueryWrapper=new QueryWrapper<>();
            mianshiguizhanbiaoQueryWrapper.like("mmc",mmc);
            mianshiguizhanbiaos = mianshiguizhanbiaoDao.selectList(mianshiguizhanbiaoQueryWrapper);
            for (Mianshiguizhanbiao m: mianshiguizhanbiaos) {
                m.setTotal(mianshiguizhanbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("zwbh",m.getZwbh()).and(e->e.like("zwmc",zwmc));
                Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
                if(zhiweibiao==null){
                    continue;
                }
                m.setZhiweibiao(zhiweibiao);
                QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
                bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
                Bumenbiao bumenbiao = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
                m.setBumenbiao(bumenbiao);
                QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
                yuangongbiaoQueryWrapper.eq("ybh",m.getYbh());
                Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
                m.setYuangongbiao(yuangongbiao);
                QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
                rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
                Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
                m.setRencaizibiao(rencaizibiao);
                QueryWrapper<Mianshiguizhanzibiao> mianshiguizhanzibiaoQueryWrapper=new QueryWrapper<>();
                mianshiguizhanzibiaoQueryWrapper.eq("mbh",m.getMbh());
                List<Mianshiguizhanzibiao> mianshiguizhanzibiaos = mianshiguizhanzibiaoDao.selectList(mianshiguizhanzibiaoQueryWrapper);
                if(mianshiguizhanzibiaos.size()==0){
                    break;
                }
                for (Mianshiguizhanzibiao mz: mianshiguizhanzibiaos) {
                    QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper1=new QueryWrapper<>();
                    yuangongbiaoQueryWrapper1.eq("ybh",mz.getYbh());
                    Yuangongbiao yuangongbiao1 = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper1);
                    mz.setYuangongbiao(yuangongbiao1);
                    QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper1=new QueryWrapper<>();
                    rencaizibiaoQueryWrapper1.eq("rzbh",yuangongbiao1.getRzbh());
                    Rencaizibiao rencaizibiao1 = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper1);
                    mz.setRencaizibiao(rencaizibiao1);
                    QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper1=new QueryWrapper<>();
                    zhiweibiaoQueryWrapper1.eq("zwbh",yuangongbiao1.getZwbh());
                    Zhiweibiao zhiweibiao1 = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper1);
                    mz.setZhiweibiao(zhiweibiao1);
                    QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper1=new QueryWrapper<>();
                    bumenbiaoQueryWrapper1.eq("bmbh",zhiweibiao1.getBmbh());
                    Bumenbiao bumenbiao1 = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper1);
                    mz.setBumenbiao(bumenbiao1);
                }
                m.setMianshiguizhanzibiaoList(mianshiguizhanzibiaos);
            }
            for (int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<mianshiguizhanbiaos.size()){
                    mianshiguizhanbiaoList.add(mianshiguizhanbiaos.get(i));
                }
            }
        } else {
            mianshiguizhanbiaos = mianshiguizhanbiaoDao.selectList(null);
            for (Mianshiguizhanbiao m: mianshiguizhanbiaos) {
                m.setTotal(mianshiguizhanbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("zwbh",m.getZwbh());
                Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
                m.setZhiweibiao(zhiweibiao);
                QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
                bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
                Bumenbiao bumenbiao = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
                m.setBumenbiao(bumenbiao);
                QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
                yuangongbiaoQueryWrapper.eq("ybh",m.getYbh());
                Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
                m.setYuangongbiao(yuangongbiao);
                QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
                rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
                Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
                m.setRencaizibiao(rencaizibiao);
                QueryWrapper<Mianshiguizhanzibiao> mianshiguizhanzibiaoQueryWrapper=new QueryWrapper<>();
                mianshiguizhanzibiaoQueryWrapper.eq("mbh",m.getMbh());
                List<Mianshiguizhanzibiao> mianshiguizhanzibiaos = mianshiguizhanzibiaoDao.selectList(mianshiguizhanzibiaoQueryWrapper);
                if(mianshiguizhanzibiaos.size()==0){
                    break;
                }
                for (Mianshiguizhanzibiao mz: mianshiguizhanzibiaos) {
                    QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper1=new QueryWrapper<>();
                    yuangongbiaoQueryWrapper1.eq("ybh",mz.getYbh());
                    Yuangongbiao yuangongbiao1 = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper1);
                    mz.setYuangongbiao(yuangongbiao1);
                    QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper1=new QueryWrapper<>();
                    rencaizibiaoQueryWrapper1.eq("rzbh",yuangongbiao1.getRzbh());
                    Rencaizibiao rencaizibiao1 = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper1);
                    mz.setRencaizibiao(rencaizibiao1);
                    QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper1=new QueryWrapper<>();
                    zhiweibiaoQueryWrapper1.eq("zwbh",yuangongbiao1.getZwbh());
                    Zhiweibiao zhiweibiao1 = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper1);
                    mz.setZhiweibiao(zhiweibiao1);
                    QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper1=new QueryWrapper<>();
                    bumenbiaoQueryWrapper1.eq("bmbh",zhiweibiao1.getBmbh());
                    Bumenbiao bumenbiao1 = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper1);
                    mz.setBumenbiao(bumenbiao1);
                }
                m.setMianshiguizhanzibiaoList(mianshiguizhanzibiaos);
            }
            for (int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<mianshiguizhanbiaos.size()){
                    mianshiguizhanbiaoList.add(mianshiguizhanbiaos.get(i));
                }
            }
        }
        return mianshiguizhanbiaoList;
    }

    @Override
    public int updateMsgz(Mianshiguizhanbiao mianshiguizhanbiao) {
        int i = mianshiguizhanbiaoDao.updateById(mianshiguizhanbiao);
        return i;
    }

    @Override
    public int delMsgz(int mbh) {
        int i = mianshiguizhanbiaoDao.deleteById(mbh);
        return i;
    }

    @Override
    public int addMsgz(MsgzVo msgzVo) {
        QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
        yuangongbiaoQueryWrapper.eq("ybh",msgzVo.getYbh());
        Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
        QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
        zhiweibiaoQueryWrapper.eq("zwbh",yuangongbiao.getZwbh());
        Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
        Mianshiguizhanbiao mianshiguizhanbiao=new Mianshiguizhanbiao();
        mianshiguizhanbiao.setYbh(msgzVo.getYbh());
        mianshiguizhanbiao.setMmc(msgzVo.getMmc());
        mianshiguizhanbiao.setZwbh(yuangongbiao.getZwbh());
        int insert = mianshiguizhanbiaoDao.insert(mianshiguizhanbiao);
        QueryWrapper<Mianshiguizhanbiao> mianshiguizhanbiaoQueryWrapper=new QueryWrapper<>();
        mianshiguizhanbiaoQueryWrapper.eq("mmc",msgzVo.getMmc());
        Mianshiguizhanbiao mianshiguizhanbiao1 = mianshiguizhanbiaoDao.selectOne(mianshiguizhanbiaoQueryWrapper);
        Mianshiguizhanzibiao mianshiguizhanzibiao=new Mianshiguizhanzibiao();
        mianshiguizhanzibiao.setMbh(mianshiguizhanbiao1.getMbh());
        mianshiguizhanzibiao.setYbh(msgzVo.getYbh());
        mianshiguizhanzibiao.setMzwt(msgzVo.getMzwt());
        int insert1 = mianshiguizhanzibiaoDao.insert(mianshiguizhanzibiao);
        return insert+insert1;
    }
}
