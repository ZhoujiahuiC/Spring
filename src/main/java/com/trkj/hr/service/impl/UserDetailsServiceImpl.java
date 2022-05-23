package com.trkj.hr.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.MenuDao;
import com.trkj.hr.mapper.RoleDao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.mapper.YuangonggzjlbiaoDao;
import com.trkj.hr.pojo.Menu;
import com.trkj.hr.pojo.Yuangongbiao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private MenuDao menuDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Yuangongbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("yzh",username);
        Yuangongbiao yuangongbiao = yuangongbiaoDao.selectOne(queryWrapper);
        log.debug("yuangongbiao:{}",yuangongbiao);
        //对返回的数据进行效验
        if(Objects.isNull(yuangongbiao)){
            throw new RuntimeException("用户名或密码错误！");
        }
        //查询对应权限信息
        List<String> role_name=
                roleDao.findRoleByusername(yuangongbiao.getYzh());
        log.debug("role_nam{}",role_name);
        List<String> menu=null;
        if(role_name.size()!=0){
            log.debug("role_nam2{}",role_name);
            menu = menuDao.findBymenu(role_name);
            log.debug("menu:{}",menu);
        }else {
            menu=new ArrayList<>();
        }

//        role_name=role_name.stream()
//                .map(rn->"ROLE_"+rn)
//                .collect(Collectors.toList());
//        menu.addAll(role_name);
        yuangongbiao.setPermissions(menu);
        return yuangongbiao;
    }
}
