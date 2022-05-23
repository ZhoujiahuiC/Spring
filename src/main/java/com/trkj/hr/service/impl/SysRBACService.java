package com.trkj.hr.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:菜单或按钮（权限）判断业务实现类,RBAC权限（Role-Based Access Control）
 * @version 1.0
 */
@Component("rabcService")
@Slf4j
public class SysRBACService {

    /**
     * 判断某用户是否具有该资源的访问权限
     */
    public boolean hasPermission(HttpServletRequest request, Authentication authentication){
        Object principal = authentication.getPrincipal();
        log.debug("开始验证权限");
        log.debug("hasPermission(principal instanceof UserDetails：{}",(principal instanceof UserDetails));
        if(principal instanceof UserDetails){
            UserDetails userDetails = ((UserDetails)principal);
            //本次要访问的资源 http://localhost:8080/root/addDept
            String auth=request.getRequestURI().substring(5);
            SimpleGrantedAuthority simpleGrantedAuthority
                    = new SimpleGrantedAuthority(auth);
            log.debug("1------------------------------------------------------------");
            log.debug(request.getRequestURI());
            log.debug(simpleGrantedAuthority.toString());
            log.debug(auth);
            log.debug(userDetails.getAuthorities().toString());
            log.debug("2------------------------------------------------------------");
            return userDetails.getAuthorities().contains(simpleGrantedAuthority);
        }

        return false;
    }
    /**
     * 判断某用户是否具有某个角色
     */
    public boolean hasRole(HttpServletRequest request, Authentication authentication,String ...roleName){
        Object principal = authentication.getPrincipal();
        log.debug("开始验证角色");
        log.debug("hasRole(principal instanceof UserDetails：{}",(principal instanceof UserDetails));
        if(principal instanceof UserDetails){
            UserDetails userDetails = ((UserDetails)principal);
            for(String n : roleName){
                SimpleGrantedAuthority simpleGrantedAuthority
                        = new SimpleGrantedAuthority("ROLE_"+n);
                log.debug("3------------------------------------------------------------");
                log.debug("角色:{}",simpleGrantedAuthority);
                log.debug("权限:{}",userDetails.getAuthorities());
                boolean flag= userDetails.getAuthorities().contains(simpleGrantedAuthority);
                log.debug("4------------------------------------------------------------");
                if(flag) return flag;
            }
        }
        return false;
    }

    private boolean matchers(String url, HttpServletRequest request) {
        log.info("在matchers方法中："+url);
        AntPathRequestMatcher matcher = new AntPathRequestMatcher(url);
        if (matcher.matches(request)) {
            return true;
        }
        return false;
    }

}
