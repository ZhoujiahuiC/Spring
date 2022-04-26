package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Shebaojishubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shebaojishubiao implements Serializable {
    private static final long serialVersionUID = -60499217460554341L;
    
    private Integer sbjsbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private Object sbjsje;
    
    private String sbname;
    
    private Object sbjnbl;


    public Integer getSbjsbh() {
        return sbjsbh;
    }

    public void setSbjsbh(Integer sbjsbh) {
        this.sbjsbh = sbjsbh;
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

    public Object getSbjsje() {
        return sbjsje;
    }

    public void setSbjsje(Object sbjsje) {
        this.sbjsje = sbjsje;
    }

    public String getSbname() {
        return sbname;
    }

    public void setSbname(String sbname) {
        this.sbname = sbname;
    }

    public Object getSbjnbl() {
        return sbjnbl;
    }

    public void setSbjnbl(Object sbjnbl) {
        this.sbjnbl = sbjnbl;
    }

}

