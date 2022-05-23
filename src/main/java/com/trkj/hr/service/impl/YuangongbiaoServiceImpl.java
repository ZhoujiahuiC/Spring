package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.YuangonVoDao;
import com.trkj.hr.pojo.Menu;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.service.MenuService;
import com.trkj.hr.service.YuangongbiaoService;
import com.trkj.hr.util.RedisUtil;
import com.trkj.hr.vo.AjaxResponse;
import com.trkj.hr.vo.YuangonVo;
import com.trkj.hr.vo.Yuangongbiaovo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public IPage<YuangonVo> selPageAllEmpSb(int pageNum, int pageSize, String rzname, String sbmc) {
        Page<YuangonVo> page=new Page<>(pageNum,pageSize);
        QueryWrapper<YuangonVo> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("b.rzname",rzname).like("d.sbmc",sbmc);
        IPage<YuangonVo> iPage=yuangonVoDao.selPageAllEmpSb(page,queryWrapper);
        log.debug("ipage:{}", CollectionUtils.isEmpty(iPage.getRecords()));

        return iPage;
    }
}
