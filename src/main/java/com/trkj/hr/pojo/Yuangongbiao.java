package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Yuangongbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Yuangongbiao implements Serializable {
    private static final long serialVersionUID = 187441236550889902L;
    
    private Integer ybh;
    
    private Integer bcbh;
    
    private Integer rzbh;
    
    private Integer zwbh;
    
    private Integer sbbh;
    
    private Integer ygzt;
    
    private String yzh;
    
    private String ymm;


    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getBcbh() {
        return bcbh;
    }

    public void setBcbh(Integer bcbh) {
        this.bcbh = bcbh;
    }

    public Integer getRzbh() {
        return rzbh;
    }

    public void setRzbh(Integer rzbh) {
        this.rzbh = rzbh;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public Integer getSbbh() {
        return sbbh;
    }

    public void setSbbh(Integer sbbh) {
        this.sbbh = sbbh;
    }

    public Integer getYgzt() {
        return ygzt;
    }

    public void setYgzt(Integer ygzt) {
        this.ygzt = ygzt;
    }

    public String getYzh() {
        return yzh;
    }

    public void setYzh(String yzh) {
        this.yzh = yzh;
    }

    public String getYmm() {
        return ymm;
    }

    public void setYmm(String ymm) {
        this.ymm = ymm;
    }

}

