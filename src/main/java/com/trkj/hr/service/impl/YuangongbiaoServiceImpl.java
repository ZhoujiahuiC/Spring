package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.*;
import com.trkj.hr.pojo.*;
import com.trkj.hr.service.MenuService;
import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.util.RedisUtil;
import com.trkj.hr.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * (Yuangongbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("yuangongbiaoService")
@Slf4j
public class YuangongbiaoServiceImpl implements YuangongbiaoService {
    @Autowired
    private JwtAuthService jwtAuthService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Autowired
    private YuangonVoDao yuangonVoDao;
    @Autowired
    private Yg_RoleDao yg_roleDao;
    @Autowired
    private ZhiweibiaoDao zhiweibiaoDao;
    @Autowired
    private BumenbiaoDao bumenbiaoDao;
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public AjaxResponse selectYg(Yuangongbiao yuangongbiao) {
        String token =jwtAuthService.login(yuangongbiao.getYzh(),yuangongbiao.getYmm());
        log.debug("token值：{}",token);
//        redisUtil.setCacheObject("login",user);
//        System.out.println(redisUtil.getCacheObject("login"));
        QueryWrapper<Yuangongbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("yzh",yuangongbiao.getYzh());
        Yuangongbiao yuangongbiao1 = yuangongbiaoDao.selectOne(queryWrapper);
        Yuangongbiaovo yuangongbiaovo=new Yuangongbiaovo();
        yuangongbiaovo.setYbh(yuangongbiao1.getYbh());
        yuangongbiaovo.setToken(token);
        yuangongbiaovo.setValidate(true);
        yuangongbiaovo.setYzh(yuangongbiao.getYzh());
        List<Menu> menu = menuService.getMenu(yuangongbiaovo.getYzh());
        System.out.println("菜单"+menu);
        log.debug("菜单：{}",menu);
        yuangongbiaovo.setMenus(menu);
        return AjaxResponse.success(yuangongbiaovo);
    }

    //统计员工状态各人数
    @Override
    public List<Yuangongbiao> tongji() {
        return yuangongbiaoDao.tongji();
    }
    //根据id修改员工状态
    @Override
    public int updateygzt(int ybh) {
        QueryWrapper<Yuangongbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("ybh",ybh);
        Yuangongbiao yuangongbiao=new Yuangongbiao();
        yuangongbiao.setYgzt(2);
        int update=yuangongbiaoDao.update(yuangongbiao,queryWrapper);
        return update;
    }

    @Override
    public List<Yuangongbiao> selectListYg(int role_id) {
        List<Yuangongbiao> yuangongbiaos = yuangongbiaoDao.selectList(null);
        QueryWrapper<Yg_Role> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("role_id",role_id);
        List<Yg_Role> yg_roles = yg_roleDao.selectList(queryWrapper);
        for (Yuangongbiao y:yuangongbiaos) {
            for (Yg_Role yr:yg_roles) {
                if (y.getYbh()==yr.getYbh()){
                    y.setDisabled(true);
                    break;
                }
                y.setDisabled(false);
            }

        }
        return yuangongbiaos;
    }
    //分页条件查询所有员工社保信息
    @Override
    public IPage<YuangonVo> selPageAllEmpSb(int pageNum, int pageSize, String rzname, String sbmc) {
        Page<YuangonVo> page=new Page<>(pageNum,pageSize);
        QueryWrapper<YuangonVo> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.rzname",rzname).like("d.sbmc",sbmc);
        IPage<YuangonVo> iPage=yuangongbiaoDao.selPageAllEmpSb(page,queryWrapper);
        log.debug("ipage:{}", CollectionUtils.isEmpty(iPage.getRecords()));
        return iPage;
    }
    @Override
    public int upEmpsbfa(Integer ybh,Integer sbbh ) {
        Yuangongbiao yuangongbiao=new Yuangongbiao();
        yuangongbiao.setYbh(ybh);
        yuangongbiao.setSbbh(sbbh);
        yuangongbiao.setIscb(1);
        return yuangongbiaoDao.upEmpcbfa(ybh,sbbh);
    }
    //修改员工基本工资
    @Override
    public int upygjbgz(Yuangongbiao yuangongbiao) {
        return yuangongbiaoDao.updateById(yuangongbiao);
    }

    @Override
    public List<YuangongxxVo> selectxx() {
        return yuangongbiaoDao.selectxx();
    }

    @Override
    public List<YgybVo> selYb(int pageNum,int pageSize) throws ParseException {
        List<YgybVo> ygybVoList=new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        String format = simpleDateFormat.format(new Date());
        log.debug("farmat:{}",format);
        Date parse = simpleDateFormat.parse(format);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        instance.add(Calendar.MONTH,-1);
        parse=instance.getTime();
        List<Yuangongbiao> yuangongbiaos = yuangongbiaoDao.selectList(null);
        for (Yuangongbiao y :yuangongbiaos) {
            QueryWrapper<YgybVo> ygybVoQueryWrapper=new QueryWrapper<>();
            Date finalParse = parse;
            ygybVoQueryWrapper.eq("ybh",y.getYbh()).and(e->e.like("xzsj", "2022-05"));
            YgybVo ygybVo = yuangongbiaoDao.selYbcc(ygybVoQueryWrapper);
            ygybVo.setYbh(y.getYbh());
            QueryWrapper<Rencaizibiao> rencaizibiaoQueryWrapper=new QueryWrapper<>();
            rencaizibiaoQueryWrapper.eq("rzbh",y.getRzbh());
            Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(rencaizibiaoQueryWrapper);
            ygybVo.setRzname(rencaizibiao.getRzname());
            QueryWrapper<Bumenbiao> bumenbiaoQueryWrapper=new QueryWrapper<>();
            bumenbiaoQueryWrapper.eq("bmbh",rencaizibiao.getBmbh());
            Bumenbiao bumenbiao = bumenbiaoDao.selectOne(bumenbiaoQueryWrapper);
            ygybVo.setBmmc(bumenbiao.getBmmc());
            ygybVo.setTotal(yuangongbiaos.size());
            ygybVo.setSjcq(ygybVo.getZc()+ygybVo.getCd()+ygybVo.getZt()+ygybVo.getCc());
            ygybVoList.add(ygybVo);
        }
        List<YgybVo> ygybVoList1=new ArrayList<>();
        for(int i=(pageNum-1)*pageSize;i<(pageNum-1)*pageSize+pageSize;i++){
            if(i<ygybVoList.size()){
                ygybVoList1.add(ygybVoList.get(i));
            }
        }
        return ygybVoList1;
    }

    @Override
    public List<YuangongxxVo> selectxxId(int ybh) {
        return yuangongbiaoDao.selectxxId(ybh);
    }

    @Override
    public List<Yuangongx1Vo> selectx1Id(int ybh) {
        return yuangongbiaoDao.selectx1Id(ybh);
    }

    @Override
    public List<Yuangongx1Vo> selectx2Id(int bmbh, int ybh) {
        return yuangongbiaoDao.selectx2Id(bmbh,ybh);
    }

}
