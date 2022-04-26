package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Rizhidianpingbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Rizhidianpingbiao implements Serializable {
    private static final long serialVersionUID = -53228457381002835L;
    
    private Integer rzdpbh;
    
    private Integer gzrzbh;
    
    private Integer ybh;
    
    private String rzdpnr;
    
    private Date rzdpsj;


    public Integer getRzdpbh() {
        return rzdpbh;
    }

    public void setRzdpbh(Integer rzdpbh) {
        this.rzdpbh = rzdpbh;
    }

    public Integer getGzrzbh() {
        return gzrzbh;
    }

    public void setGzrzbh(Integer gzrzbh) {
        this.gzrzbh = gzrzbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public String getRzdpnr() {
        return rzdpnr;
    }

    public void setRzdpnr(String rzdpnr) {
        this.rzdpnr = rzdpnr;
    }

    public Date getRzdpsj() {
        return rzdpsj;
    }

    public void setRzdpsj(Date rzdpsj) {
        this.rzdpsj = rzdpsj;
    }

}

