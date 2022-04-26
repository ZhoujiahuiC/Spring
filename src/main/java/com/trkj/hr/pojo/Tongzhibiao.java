package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Tongzhibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Tongzhibiao implements Serializable {
    private static final long serialVersionUID = -86460366947497339L;
    
    private Integer tzbh;
    
    private Integer ybh;
    
    private Integer bmbh;
    
    private String tznr;
    
    private Date tzsj;
    
    private Integer tzyds;


    public Integer getTzbh() {
        return tzbh;
    }

    public void setTzbh(Integer tzbh) {
        this.tzbh = tzbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getBmbh() {
        return bmbh;
    }

    public void setBmbh(Integer bmbh) {
        this.bmbh = bmbh;
    }

    public String getTznr() {
        return tznr;
    }

    public void setTznr(String tznr) {
        this.tznr = tznr;
    }

    public Date getTzsj() {
        return tzsj;
    }

    public void setTzsj(Date tzsj) {
        this.tzsj = tzsj;
    }

    public Integer getTzyds() {
        return tzyds;
    }

    public void setTzyds(Integer tzyds) {
        this.tzyds = tzyds;
    }

}

