package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.*;
import com.trkj.hr.pojo.*;
import com.trkj.hr.service.XingzijilubiaoService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * (Xingzijilubiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xingzijilubiaoService")
@Slf4j
public class XingzijilubiaoServiceImpl implements XingzijilubiaoService {
    @Resource
    private  XingzijilubiaoDao xingzijilubiaoDao;
    @Resource
    private YuangongbiaoDao yuangongbiaoDao;
    @Resource
    private RencaizibiaoDao rencaizibiaoDao;
    @Resource
    private ZhiweibiaoDao zhiweibiaoDao;
    @Resource
    private BumenbiaoDao bumenbiaoDao;
    @Resource
    private ShebaofananbiaoDao shebaofananbiaoDao;
    @Resource
    private ShebaojishubiaoDao shebaojishubiaoDao;
    @Resource
    private SbzjbDao sbzjbDao;
    @Resource
    private NashuibiaoDao nashuibiaoDao;
    @Resource
    private XinzizhongjianbiaoDao xinzizhongjianbiaoDao;

    @Resource
    private XinziyaosuxiangbiaoDao xinziyaosuxiangbiaoDao;
    @Resource
    private KhDao khDao;
    @Resource
    private KhdjDao khdjDao;
    @Override
    public List<Xingzijilubiao> selAllxzjl() {
        List<Xingzijilubiao> xingzijilubiaos=null;
        xingzijilubiaos = xingzijilubiaoDao.selectList(null);
        for (Xingzijilubiao xingzijilubiao:xingzijilubiaos) {
            QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
            yuangongbiaoQueryWrapper.eq("ybh",xingzijilubiao.getYbh());
            Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
            xingzijilubiao.setYuangongbiao(yuangongbiao);
            QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
            rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
            Rencaizibiao rencaizibiao=rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
            xingzijilubiao.setRencaizibiao(rencaizibiao);
            QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
            zhiweibiaoQueryWrapper.eq("zwbh",yuangongbiao.getZwbh());
            Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
            xingzijilubiao.setZhiweibiao(zhiweibiao);
            QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
            bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
            Bumenbiao bumenbiao=bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
            xingzijilubiao.setBumenbiao(bumenbiao);
            QueryWrapper<Kh> khQueryWrapper=new QueryWrapper<>();
            khQueryWrapper.eq("ybh",yuangongbiao.getYbh());
            Double jx=0.0;
            List<Kh> khs = khDao.selectList(khQueryWrapper);
            for (Kh k :khs) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date=sdf.format(xingzijilubiao.getSzjlsj());
                String date1=sdf.format(k.getKhtime());
                log.debug("date:{}",date);
                log.debug("date1:{}",date1);
                log.debug("xingzijilubiao.getSzjlsj():{}",xingzijilubiao.getSzjlsj());
                log.debug("k.getKhtime():{}",k.getKhtime());
                log.debug("bulll:{}",date.equals(date1));
                if (date.equals(date1)){
                    xingzijilubiao.setKhid(k.getKhid());
                    log.debug("khid:{}",k.getKhid());
                    log.debug("khdjid:{}",k.getKhdjid());
                    QueryWrapper<Khdj> khdjQueryWrapper=new QueryWrapper<>();
                    khdjQueryWrapper.eq("khdjid",k.getKhdjid());
                    Khdj khdj = khdjDao.selectOne(khdjQueryWrapper);
                    log.debug("khdj:{}",khdj);
                    log.debug("d:{}",xingzijilubiao.getXzjljbgz());
                    log.debug("da:{}",khdj.getKhjebl());
                    log.debug("das:{}",xingzijilubiao.getXzjljbgz()*khdj.getKhjebl());
                    jx=xingzijilubiao.getXzjljbgz()*khdj.getKhjebl();

                }
            }
            xingzijilubiao.setJxgz(jx);
            QueryWrapper<Sbzjb> sbzjbQueryWrapper=new QueryWrapper<>();
            sbzjbQueryWrapper.eq("sbbh",yuangongbiao.getSbbh());
            List<Sbzjb> sbzjbs = sbzjbDao.selectList(sbzjbQueryWrapper);
            double i=0.0;
            for (Sbzjb sbzjb: sbzjbs) {
                QueryWrapper<Shebaojishubiao> shebaojishubiaoQueryWrapper=new QueryWrapper<>();
                shebaojishubiaoQueryWrapper.eq("sbjsbh",sbzjb.getSbjsbh());
                Shebaojishubiao shebaojishubiao = shebaojishubiaoDao.selectOne(shebaojishubiaoQueryWrapper);
                i=i+(shebaojishubiao.getSbjsje()*(shebaojishubiao.getSbjnbl()/100));
            }
            xingzijilubiao.setXzjlsb(i);
            QueryWrapper<Xinzizhongjianbiao> xinzizhongjianbiaoQueryWrapper=new QueryWrapper<>();
            xinzizhongjianbiaoQueryWrapper.eq("ybh",yuangongbiao.getYbh());
            List<Xinzizhongjianbiao> xinzizhongjianbiaoList = xinzizhongjianbiaoDao.selectList(xinzizhongjianbiaoQueryWrapper);
            List<Xinziyaosuxiangbiao> xinziyaosuxiangbiaoList= new ArrayList<>();
            for (Xinzizhongjianbiao xinzizhongjianbiao: xinzizhongjianbiaoList) {
                QueryWrapper<Xinziyaosuxiangbiao> xinziyaosuxiangbiaoQueryWrapper=new QueryWrapper<>();
                xinziyaosuxiangbiaoQueryWrapper.eq("xzysbh",xinzizhongjianbiao.getXzysbh());
                Xinziyaosuxiangbiao xinziyaosuxiangbiao = xinziyaosuxiangbiaoDao.selectOne(xinziyaosuxiangbiaoQueryWrapper);
                xinziyaosuxiangbiao.setXzysje(xinziyaosuxiangbiao.getXzysje()*xinzizhongjianbiao.getXzzjsl());
                xinziyaosuxiangbiaoList.add(xinziyaosuxiangbiao);
            }
            xingzijilubiao.setXinziyaosuxiangbiaoList(xinziyaosuxiangbiaoList);
            Double zong=0.0;
            for ( Xinziyaosuxiangbiao xinziyaosuxiangbiao: xinziyaosuxiangbiaoList) {
                log.debug("sss:{}",xinziyaosuxiangbiao.getXzysje());
                log.debug("zongs:{}",zong);
                zong=zong+xinziyaosuxiangbiao.getXzysje();
            }
            log.debug("aaaa:{}",xingzijilubiao.getXzjljbgz());
            log.debug("bbbb:{}",xingzijilubiao.getXzjlsb());
            zong=zong+(xingzijilubiao.getXzjljbgz()-xingzijilubiao.getXzjlsb())+xingzijilubiao.getJxgz();
            log.debug("zong:{}",zong);
            xingzijilubiao.setSzjlze(zong);
            Double sh=zong-5000;
            log.debug("sh:{}",sh);
            if(sh<0){
                sh=0.0;
            }
            List<Nashuibiao> nashuibiaos = nashuibiaoDao.selectList(null);
            for ( Nashuibiao n: nashuibiaos) {
                log.debug("ssss:{}",(sh>=n.getNszdjne()& sh<= n.getNszgjne()));
                if(sh>=n.getNszdjne()& sh<= n.getNszgjne()){
                    log.debug("ns:{}",n.getNsjnbl());
                    log.debug("ns1:{}",n.getNsjnbl()/100);
                    sh=sh*(n.getNsjnbl()/100);
                    log.debug("sh3:{}",sh);
                    break;
                }
            }
            log.debug("zong1:{}",zong);
            log.debug("sh2:{}",sh);
            log.debug("sh1:{}",sh+5000);
            if(sh>=0){
                xingzijilubiao.setSzjlsh(sh);
            }

        }
        return xingzijilubiaos;
    }

//    @Override
//    public List<Xingzijilubiao> selAllxzjl() {
//        List<Xingzijilubiao> xingzijilubiaos = xingzijilubiaoDao.selectList(null);
//        for (Xingzijilubiao x: xingzijilubiaos) {
//            QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper=new QueryWrapper<>();
//            yuangongbiaoQueryWrapper.eq("ybh",x.getYbh());
//            Yuangongbiao yuangongbiao=yuangongbiaoDao.selectOne(yuangongbiaoQueryWrapper);
//            x.setYuangongbiao(yuangongbiao);
//            x.setXzjljbgz(yuangongbiao.getXzjbgz());
//            QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
//            rencaizibiaoQueryWrapper.eq("rzbh",yuangongbiao.getRzbh());
//            Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
//            x.setRencaizibiao(rencaizibiao);
//            QueryWrapper<Zhiweibiao> zhiweibiaoQueryWrapper=new QueryWrapper<>();
//            zhiweibiaoQueryWrapper.eq("zwbh",yuangongbiao.getZwbh());
//            Zhiweibiao zhiweibiao = zhiweibiaoDao.selectOne(zhiweibiaoQueryWrapper);
//            x.setZhiweibiao(zhiweibiao);
//            QueryWrapper<Xinzijibengongzibiao> xinzijibengongzibiaoQueryWrapper=new QueryWrapper<>();
//            xinzijibengongzibiaoQueryWrapper.eq("zwbh",zhiweibiao.getZwbh());
//            Xinzijibengongzibiao xinzijibengongzibiao=xinzijibengongzibiaoDao2.selectOne(xinzijibengongzibiaoQueryWrapper);
//            x.setXinzijibengongzibiao(xinzijibengongzibiao);
//            QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
//            bumenbiaoQueryWrapper.eq("bmbh",zhiweibiao.getBmbh());
//            Bumenbiao bumenbiao=bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
//            zhiweibiao.setBumenbiao(bumenbiao);
//            QueryWrapper<Shebaofananbiao> shebaofananbiaoQueryWrapper=new QueryWrapper<>();
//            shebaofananbiaoQueryWrapper.eq("sbbh",yuangongbiao.getSbbh());
//            Shebaofananbiao shebaofananbiao = shebaofananbiaoDao.selectOne(shebaofananbiaoQueryWrapper);
//            QueryWrapper<Sbzjb> sbzjbQueryWrapper=new QueryWrapper<>();
//            sbzjbQueryWrapper.eq("sbbh",shebaofananbiao.getSbbh());
//            List<Sbzjb> sbzjbs=sbzjbDao.selectList(sbzjbQueryWrapper);
//            List<Shebaojishubiao> shebaojishubiaoList=new ArrayList<>();
//            int i=0;
//            for (Sbzjb s:sbzjbs) {
//                Shebaojishubiao shebaojishubiao=shebaojishubiaoDao.selectById(s.getSbjsbh());
//                shebaojishubiaoList.add(i,shebaojishubiao);
//                i++;
//            }
//            shebaofananbiao.setJs(shebaojishubiaoList);
//            x.setShebaofananbiao(shebaofananbiao);
//            QueryWrapper<Nashuibiao> nashuibiaoQueryWrapper=new QueryWrapper<>();
//            nashuibiaoQueryWrapper.eq("nsbbh",yuangongbiao.getNsbbh());
//            Nashuibiao nashuibiao=nashuibiaoDao.selectOne(nashuibiaoQueryWrapper);
//            x.setNashuibiao(nashuibiao);
//            QueryWrapper<Xinzizhongjianbiao> xinzizhongjianbiaoQueryWrapper=new QueryWrapper<>();
//            xinzijibengongzibiaoQueryWrapper.eq("ybh",yuangongbiao.getYbh());
//            List<Xinzizhongjianbiao> xinzizhongjianbiaoList=xinzizhongjianbiaoDao.selectList(xinzizhongjianbiaoQueryWrapper);
//            log.debug("xinzizhongjianbiaoList:{}",xinzizhongjianbiaoList);
//            if(xinzizhongjianbiaoList.size()!=0){
//                for (Xinzizhongjianbiao a:xinzizhongjianbiaoList) {
//                    QueryWrapper<Xinziyaosuxiangbiao> xinziyaosuxiangbiaoQueryWrapper1=new QueryWrapper<>();
//                    xinziyaosuxiangbiaoQueryWrapper1.eq("xzysbh",a.getXzysbh());
//                    Xinziyaosuxiangbiao xinziyaosuxiangbiao = xinziyaosuxiangbiaoDao.selectOne(xinziyaosuxiangbiaoQueryWrapper1);
//                    log.debug("xinziyaosuxiangbiao:{}",xinziyaosuxiangbiao);
//                    a.setXinziyaosuxiangbiao(xinziyaosuxiangbiao);
//                }
//            }
//            yuangongbiao.setXinzizhongjianbiaoList(xinzizhongjianbiaoList);
//        }
//
//        return xingzijilubiaos;
//    }
}
