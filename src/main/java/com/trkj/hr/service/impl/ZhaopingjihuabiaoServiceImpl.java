package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.BumenbiaoDao;
import com.trkj.hr.mapper.ZhiweibiaoDao;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.mapper.ZhaopingjihuabiaoDao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.service.ZhaopingjihuabiaoService;
import com.trkj.hr.vo.YuangonVo;
import com.trkj.hr.vo.ZhaopingjilibiaoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Zhaopingjihuabiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("zhaopingjihuabiaoService")
@Slf4j
public class ZhaopingjihuabiaoServiceImpl implements ZhaopingjihuabiaoService {
    @Autowired
    private BumenbiaoDao bumenbiaoDao;
    @Autowired
    private ZhiweibiaoDao zhiweibiaoDao;
    @Autowired
    private ZhaopingjihuabiaoDao zhaopingjihuabiaoDao;

    @Override
    public List<Bumenbiao> selZpjl(int pageNum, int pageSize, String bmmc, String zwmc) {
        List<Bumenbiao> bumenbiaos=null;
        List<Bumenbiao> bumenbiaoList=new ArrayList<>();
        if(!bmmc.equals("")&&zwmc.equals("")){
            QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
            bumenbiaoQueryWrapper.like("bmmc",bmmc);
            bumenbiaos =  bumenbiaoDao.selectList(bumenbiaoQueryWrapper);
            for (Bumenbiao b: bumenbiaos) {
                b.setTotal(bumenbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("bmbh", b.getBmbh());
                List<Zhiweibiao> zhiweibiaos = zhiweibiaoDao.selectList(zhiweibiaoQueryWrapper);
                List<Zhaopingjihuabiao> zhaopingjihuabiaoList=new ArrayList<>();
                for (Zhiweibiao z :zhiweibiaos) {
                    QueryWrapper<Zhaopingjihuabiao> zhaopingjihuabiaoQueryWrapper=new QueryWrapper<>();
                    zhaopingjihuabiaoQueryWrapper.eq("zwbh",z.getZwbh());
                    List<Zhaopingjihuabiao> zhaopingjihuabiaoList1 = zhaopingjihuabiaoDao.selectList(zhaopingjihuabiaoQueryWrapper);
                    if (zhaopingjihuabiaoList1!=null){
                        for (Zhaopingjihuabiao zhaopingjihuabiao: zhaopingjihuabiaoList1) {
                            zhaopingjihuabiao.setZwmc(z.getZwmc());
                            zhaopingjihuabiaoList.add(zhaopingjihuabiao);
                        }
                    }else{
                        continue;
                    }
                }
                b.setZhaopingjihuabiaoList(zhaopingjihuabiaoList);
            }
            for(int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<bumenbiaos.size()){
                    bumenbiaoList.add(bumenbiaos.get(i));
                }
            }
        }else if (!zwmc.equals("")&&bmmc.equals("")){

            bumenbiaos =  bumenbiaoDao.selectList(null);
            for (Bumenbiao b: bumenbiaos) {
                b.setTotal(bumenbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("bmbh", b.getBmbh()).and(e->e.like("zwmc",zwmc));
                List<Zhiweibiao> zhiweibiaos = zhiweibiaoDao.selectList(zhiweibiaoQueryWrapper);
                List<Zhaopingjihuabiao> zhaopingjihuabiaoList=new ArrayList<>();

                for (Zhiweibiao z :zhiweibiaos) {
                    QueryWrapper<Zhaopingjihuabiao> zhaopingjihuabiaoQueryWrapper=new QueryWrapper<>();
                    zhaopingjihuabiaoQueryWrapper.eq("zwbh",z.getZwbh());
                    List<Zhaopingjihuabiao> zhaopingjihuabiaoList1 = zhaopingjihuabiaoDao.selectList(zhaopingjihuabiaoQueryWrapper);
                    if (zhaopingjihuabiaoList1!=null){
                        for (Zhaopingjihuabiao zhaopingjihuabiao: zhaopingjihuabiaoList1) {
                            zhaopingjihuabiao.setZwmc(z.getZwmc());
                            zhaopingjihuabiaoList.add(zhaopingjihuabiao);
                        }
                    }else{
                        continue;
                    }
                }
                b.setZhaopingjihuabiaoList(zhaopingjihuabiaoList);
            }
            for(int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<bumenbiaos.size()&&bumenbiaos.get(i).getZhaopingjihuabiaoList().size()!=0){
                    bumenbiaoList.add(bumenbiaos.get(i));
                }
            }
        }else if(!bmmc.equals("")&&!zwmc.equals("")){
            QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
            bumenbiaoQueryWrapper.like("bmmc",bmmc);
            bumenbiaos =  bumenbiaoDao.selectList(bumenbiaoQueryWrapper);
            for (Bumenbiao b: bumenbiaos) {
                b.setTotal(bumenbiaos.size());
                QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
                zhiweibiaoQueryWrapper.eq("bmbh", b.getBmbh()).and(e->e.like("zwmc",zwmc));
                List<Zhiweibiao> zhiweibiaos = zhiweibiaoDao.selectList(zhiweibiaoQueryWrapper);
                List<Zhaopingjihuabiao> zhaopingjihuabiaoList=new ArrayList<>();

                for (Zhiweibiao z :zhiweibiaos) {
                    QueryWrapper<Zhaopingjihuabiao> zhaopingjihuabiaoQueryWrapper=new QueryWrapper<>();
                    zhaopingjihuabiaoQueryWrapper.eq("zwbh",z.getZwbh());
                    List<Zhaopingjihuabiao> zhaopingjihuabiaoList1 = zhaopingjihuabiaoDao.selectList(zhaopingjihuabiaoQueryWrapper);
                    if (zhaopingjihuabiaoList1!=null){
                        for (Zhaopingjihuabiao zhaopingjihuabiao: zhaopingjihuabiaoList1) {
                            zhaopingjihuabiao.setZwmc(z.getZwmc());
                            zhaopingjihuabiaoList.add(zhaopingjihuabiao);
                        }
                    }else{
                        continue;
                    }
                }
                b.setZhaopingjihuabiaoList(zhaopingjihuabiaoList);
            }
            for(int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<bumenbiaos.size()&&bumenbiaos.get(i).getZhaopingjihuabiaoList().size()!=0){
                    bumenbiaoList.add(bumenbiaos.get(i));
                }
            }
        }else{
                    bumenbiaos =  bumenbiaoDao.selectList(null);
        for (Bumenbiao b: bumenbiaos) {
            b.setTotal(bumenbiaos.size());
            QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
            zhiweibiaoQueryWrapper.eq("bmbh", b.getBmbh());
            List<Zhiweibiao> zhiweibiaos = zhiweibiaoDao.selectList(zhiweibiaoQueryWrapper);
            List<Zhaopingjihuabiao> zhaopingjihuabiaoList=new ArrayList<>();
            for (Zhiweibiao z :zhiweibiaos) {
                QueryWrapper<Zhaopingjihuabiao> zhaopingjihuabiaoQueryWrapper=new QueryWrapper<>();
                zhaopingjihuabiaoQueryWrapper.eq("zwbh",z.getZwbh());
                List<Zhaopingjihuabiao> zhaopingjihuabiaoList1 = zhaopingjihuabiaoDao.selectList(zhaopingjihuabiaoQueryWrapper);
                if (zhaopingjihuabiaoList1!=null){
                    for (Zhaopingjihuabiao zhaopingjihuabiao: zhaopingjihuabiaoList1) {
                        zhaopingjihuabiao.setZwmc(z.getZwmc());
                        zhaopingjihuabiaoList.add(zhaopingjihuabiao);
                    }
                }else{
                    continue;
                }
            }
            b.setZhaopingjihuabiaoList(zhaopingjihuabiaoList);
        }
            for(int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
                if(i<bumenbiaos.size()){
                    bumenbiaoList.add(bumenbiaos.get(i));
                }
            }
        }
        return bumenbiaoList;
    }

    @Override
    public int addZpjl(Zhaopingjihuabiao zhaopingjihuabiao) {
        int insert = zhaopingjihuabiaoDao.insert(zhaopingjihuabiao);
        return insert;
    }

    @Override
    public int deleteZpjl(int zbh) {
        int i = zhaopingjihuabiaoDao.deleteById(zbh);
        return i;
    }

    @Override
    public int updateZpjl(Zhaopingjihuabiao zhaopingjihuabiao) {
        int i = zhaopingjihuabiaoDao.updateById(zhaopingjihuabiao);
        return i;
    }
}
