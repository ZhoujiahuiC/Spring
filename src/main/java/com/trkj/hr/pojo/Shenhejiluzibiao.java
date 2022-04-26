package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Shenhejiluzibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shenhejiluzibiao implements Serializable {
    private static final long serialVersionUID = -13354613802767898L;
    
    private Integer shjlzbbh;
    
    private Integer shsxid;
    
    private Integer ybh;
    
    private Integer shjlbh;
    
    private Integer shjlzzt;
    
    private Date shjlzsj;
    
    private String shjlzbz;


    public Integer getShjlzbbh() {
        return shjlzbbh;
    }

    public void setShjlzbbh(Integer shjlzbbh) {
        this.shjlzbbh = shjlzbbh;
    }

    public Integer getShsxid() {
        return shsxid;
    }

    public void setShsxid(Integer shsxid) {
        this.shsxid = shsxid;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Integer getShjlzzt() {
        return shjlzzt;
    }

    public void setShjlzzt(Integer shjlzzt) {
        this.shjlzzt = shjlzzt;
    }

    public Date getShjlzsj() {
        return shjlzsj;
    }

    public void setShjlzsj(Date shjlzsj) {
        this.shjlzsj = shjlzsj;
    }

    public String getShjlzbz() {
        return shjlzbz;
    }

    public void setShjlzbz(String shjlzbz) {
        this.shjlzbz = shjlzbz;
    }

}

