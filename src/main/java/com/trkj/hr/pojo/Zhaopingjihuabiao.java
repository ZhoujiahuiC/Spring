package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Zhaopingjihuabiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Zhaopingjihuabiao implements Serializable {
    private static final long serialVersionUID = -93333286336893673L;
    
    private Integer zbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private Integer zwbh;
    
    private Integer zrs;
    
    private String zmc;


    public Integer getZbh() {
        return zbh;
    }

    public void setZbh(Integer zbh) {
        this.zbh = zbh;
    }

    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public Integer getZrs() {
        return zrs;
    }

    public void setZrs(Integer zrs) {
        this.zrs = zrs;
    }

    public String getZmc() {
        return zmc;
    }

    public void setZmc(String zmc) {
        this.zmc = zmc;
    }

}

