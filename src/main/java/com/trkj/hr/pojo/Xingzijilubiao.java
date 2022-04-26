package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Xingzijilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Xingzijilubiao implements Serializable {
    private static final long serialVersionUID = -28602785173519428L;
    
    private Integer xzjlbh;
    
    private Integer ybh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Object xzjljbgz;
    
    private Object xzjlsb;
    
    private Object szjlqj;
    
    private Object szjlze;
    
    private Object szjlsh;
    
    private Date szjlsj;


    public Integer getXzjlbh() {
        return xzjlbh;
    }

    public void setXzjlbh(Integer xzjlbh) {
        this.xzjlbh = xzjlbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
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

    public Object getXzjljbgz() {
        return xzjljbgz;
    }

    public void setXzjljbgz(Object xzjljbgz) {
        this.xzjljbgz = xzjljbgz;
    }

    public Object getXzjlsb() {
        return xzjlsb;
    }

    public void setXzjlsb(Object xzjlsb) {
        this.xzjlsb = xzjlsb;
    }

    public Object getSzjlqj() {
        return szjlqj;
    }

    public void setSzjlqj(Object szjlqj) {
        this.szjlqj = szjlqj;
    }

    public Object getSzjlze() {
        return szjlze;
    }

    public void setSzjlze(Object szjlze) {
        this.szjlze = szjlze;
    }

    public Object getSzjlsh() {
        return szjlsh;
    }

    public void setSzjlsh(Object szjlsh) {
        this.szjlsh = szjlsh;
    }

    public Date getSzjlsj() {
        return szjlsj;
    }

    public void setSzjlsj(Date szjlsj) {
        this.szjlsj = szjlsj;
    }

}

