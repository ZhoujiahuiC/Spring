package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Rencaibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Rencaibiao implements Serializable {
    private static final long serialVersionUID = 640387137752934297L;
    
    private Integer rid;
    
    private Integer ybh;
    
    private Integer zwbh;
    
    private Integer rzbh;
    
    private Integer rzt;
    
    private Date rsj;
    
    private String rsf;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public Integer getRzbh() {
        return rzbh;
    }

    public void setRzbh(Integer rzbh) {
        this.rzbh = rzbh;
    }

    public Integer getRzt() {
        return rzt;
    }

    public void setRzt(Integer rzt) {
        this.rzt = rzt;
    }

    public Date getRsj() {
        return rsj;
    }

    public void setRsj(Date rsj) {
        this.rsj = rsj;
    }

    public String getRsf() {
        return rsf;
    }

    public void setRsf(String rsf) {
        this.rsf = rsf;
    }

}

