package com.trkj.hr.util;

import com.trkj.hr.pojo.Menu;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MenuUtil {
    public static List<Menu> assemberMenus(List<Menu> menus){
        List<Menu> one=null;
        if (menus!=null){
            one=menus.stream().filter(u -> u.getMenu_z_id()==0).collect(Collectors.toList());
            log.debug(one.toString());
            one.forEach(o->{
                List<Menu> two=menus.stream().filter(u -> u.getMenu_z_id()==o.getMenu_id()).collect(Collectors.toList());
                o.setAsideChildren(two);
            });
        }
        System.out.println("qqq"+one);
        return one;
    }
    public static List<String> assemberAuthorities(List<Menu> menus){
        List<String> authorities=menus.stream().map(u->u.getUrl()).collect(Collectors.toList());
        return authorities;
    }
}

