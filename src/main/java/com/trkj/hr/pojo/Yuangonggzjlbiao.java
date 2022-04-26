package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Yuangonggzjlbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Yuangonggzjlbiao implements Serializable {
    private static final long serialVersionUID = -37162512648632433L;
    
    private Integer yggzbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Integer ybh;
    
    private Integer yggzzt;
    
    private Date yggzsj;


    public Integer getYggzbh() {
        return yggzbh;
    }

    public void setYggzbh(Integer yggzbh) {
        this.yggzbh = yggzbh;
    }

    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getYggzzt() {
        return yggzzt;
    }

    public void setYggzzt(Integer yggzzt) {
        this.yggzzt = yggzzt;
    }

    public Date getYggzsj() {
        return yggzsj;
    }

    public void setYggzsj(Date yggzsj) {
        this.yggzsj = yggzsj;
    }

}

