package com.trkj.hr.filter;



import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.util.JwtTokenUtil;
import com.trkj.hr.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;

@Component
@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    // 令牌自定义标识
    @Value("token")
    private String header;
    @Resource
    JwtTokenUtil jwtTokenUtil;
    @Autowired
    RedisUtil redisUtil;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //获取token
        Enumeration<String> headerNames = request.getHeaderNames();
        log.debug("a===={}",request.getParameter("a"));
        while (headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
            System.out.println(name +"  "+ request.getHeader(name));
        }
        log.debug("headers:{}",request.getHeader(header));
        String token = request.getHeader(header);
        System.out.println("token:{"+token+"}");
        //如果token为空的话就放行
        if(!StringUtils.hasText(token)){
           //放行
            filterChain.doFilter(request,response);
            return;
        }

        //解析token
        String usernameFromToken = jwtTokenUtil.getUsernameFromToken(token);
        String userIdFromToken = jwtTokenUtil.getUserIdFromToken(token);
        String redisKey="login"+userIdFromToken;
        //从redis中获取用户信息
        Yuangongbiao loginUser = (Yuangongbiao) redisUtil.getCacheObject(redisKey);
        if(Objects.isNull(loginUser)){
            throw new RuntimeException("用户未登录！");
        }
        //存入SecurityContexHolder
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=
                new UsernamePasswordAuthenticationToken(loginUser,null,loginUser.getAuthorities());
        System.out.println("sdadsa:"+usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        //放行
        filterChain.doFilter(request,response);
    }
}
