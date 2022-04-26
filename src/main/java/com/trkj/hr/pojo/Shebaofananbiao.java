package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Shebaofananbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shebaofananbiao implements Serializable {
    private static final long serialVersionUID = -18939371336771667L;
    
    private Integer sbbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private String sbmc;


    public Integer getSbbh() {
        return sbbh;
    }

    public void setSbbh(Integer sbbh) {
        this.sbbh = sbbh;
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

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

}

