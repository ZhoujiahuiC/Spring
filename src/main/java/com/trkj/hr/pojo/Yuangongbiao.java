package com.trkj.hr.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (Yuangongbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
@TableName(value = "yuangongbiao")
public class Yuangongbiao  implements UserDetails {

    @TableId

    private Integer ybh;
    
    private Integer bcbh;
    
    private Integer rzbh;
    
    private Integer zwbh;
    
    private Integer sbbh;
    
    private Integer ygzt;
    
    private String yzh;
    
    private String ymm;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ygrzrq;
    private Double xzjbgz;
    private int iscb;
    private Integer nsbbh;
    @TableField(exist = false)
    private List<Xinzizhongjianbiao> xinzizhongjianbiaoList;
    @TableField("false")
    private Rencaizibiao rencaizibiao;
    @TableField("false")
    private List<String> permissions;
//    public Yuangongbiao( List<String> permissions) {
//        this.permissions = permissions;
//    }
    public List<String> setPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    //成员变量
    @TableField("false")
    @JSONField(serialize = false)
    private List<SimpleGrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (authorities!=null){
            return authorities;
        }
        if(permissions!=null){
            authorities=permissions.stream()
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return getYmm();
    }

    @Override
    public String getUsername() {
        return getYzh();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

//
//    public Integer getYbh() {
//        return ybh;
//    }
//
//    public void setYbh(Integer ybh) {
//        this.ybh = ybh;
//    }
//
//    public Integer getBcbh() {
//        return bcbh;
//    }
//
//    public void setBcbh(Integer bcbh) {
//        this.bcbh = bcbh;
//    }
//
//    public Integer getRzbh() {
//        return rzbh;
//    }
//
//    public void setRzbh(Integer rzbh) {
//        this.rzbh = rzbh;
//    }
//
//    public Integer getZwbh() {
//        return zwbh;
//    }
//
//    public void setZwbh(Integer zwbh) {
//        this.zwbh = zwbh;
//    }
//
//    public Integer getSbbh() {
//        return sbbh;
//    }
//
//    public void setSbbh(Integer sbbh) {
//        this.sbbh = sbbh;
//    }
//
//    public Integer getYgzt() {
//        return ygzt;
//    }
//
//    public void setYgzt(Integer ygzt) {
//        this.ygzt = ygzt;
//    }
//
//    public String getYzh() {
//        return yzh;
//    }
//
//    public void setYzh(String yzh) {
//        this.yzh = yzh;
//    }
//
//    public String getYmm() {
//        return ymm;
//    }
//
//    public void setYmm(String ymm) {
//        this.ymm = ymm;
//    }
    @TableField("false")
    private Integer zs;
    @TableField("false")
    private Integer sx;
    @TableField("false")
    private Integer dlz;
    @TableField("false")
    private Integer drz;
    @TableField("false")
    private Integer ylz;
    @TableField("false")
    private Boolean disabled;
}

