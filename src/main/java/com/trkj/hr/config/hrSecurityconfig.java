package com.trkj.hr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
public class hrSecurityconfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private PasswordEncoder passwordEncoder;
    //用户管理，权限的给予(⊙﹏⊙)
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("general_manager")
                .password(passwordEncoder.encode("123456"))
                .roles("g1")
                .authorities("")
                .and()
                .withUser("chairman")
                .password(passwordEncoder.encode("123456"))
                .roles("c1")
                .authorities("");
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //页面权限的设置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .formLogin()
                .loginPage("")//没有权限的话就跳转到登陆页面
                .loginProcessingUrl("")//登录提交的地址
                .usernameParameter("")//与表单的name名一致，用户的名字
                .passwordParameter("")//与表单的name一致，用户的密码
                .successForwardUrl("")//登录成功跳到主界面
                .failureForwardUrl("")//登陆失败跳到错误界面
                .and()
                .authorizeRequests()
                .antMatchers("")
        ;
    }
}
