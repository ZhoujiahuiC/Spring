package com.trkj.hr.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

@EnableWebSecurity
public class hrSecurityconfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;
    //用户管理，权限的给予(⊙﹏⊙)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("general_manager")
//                .password(passwordEncoder.encode("123456"))
//                .roles("g1")
//                .authorities("zy")
//                .and()
//                .withUser("chairman")
//                .password(passwordEncoder.encode("123456"))
//                .roles("c1")
//                .authorities("zy");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //页面权限的设置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        //禁用CSRF保护,指跨站请求伪造，我们使用JWT机制基本可以预防
//        http.csrf().disable()
//                .cors()
//                .and()
//                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class)//过滤器
//                //提供注销支持。
//                .logout()
//                //触发注销的URL（默认值为 /logout ）。 如果启用CSRF保护（默认），则该请求也必须是POST。
//                .logoutUrl("/signout")
//                //添加一个 LogoutHandler用于处理用户注销时的处理。
//                .logoutSuccessHandler(myLogoutSuccessHandler)
//                .and()
//                //http.authorizeRequests()方法有很多子方法，每个子匹配器将会按照声明的顺序起作用,即可以在这里定制请求授权的规则
//                .authorizeRequests()
//                //如果URL等于"/login"此时任何用户可以访问，如果是"/login/**",
//                // 则表示URL等于/login或是以/login开头的，任何用户都可以访问请求。
//                //这里这样配置的目的是在于我们自己定义登录验证的地址，而没有用spring security默认的验证地址
//                //.antMatchers("/login").anonymous()
//                .antMatchers("/login","/news/**","/public/upload/**").permitAll()
//                //"/SysMain/**","/DeptMain/**这两个路径下的资源需要有admin角色或是有权限
//                .antMatchers("/SysMain/**","/DeptMain/**").access("@rabcService.hasRole(request,authentication,'admin') or @rabcService.hasPermission(request,authentication)")
//                //.antMatchers("/SysMain/**","/DeptMain/**").hasRole("admin")
//                //其它URL都需要用户通过rabcService.hasPermission方法的验证才可以访问
//                .anyRequest().access("@rabcService.hasPermission(request,authentication)")
//                // .and()
//                .and()
//                //定制我们自己的 session 策略
//                .sessionManagement()
//                // 调整为让 Spring Security 不创建和使用 session
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                // 配置没有权限自定义处理类
//                .exceptionHandling().accessDeniedHandler(userAuthAccessDeniedHandler)
//                //配置用户未登录处理类
//                .authenticationEntryPoint(userAuthenticationEntryPointHandler);
    }
}
