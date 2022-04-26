package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Nashuibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Nashuibiao implements Serializable {
    private static final long serialVersionUID = 546004811077005624L;
    
    private Integer nsbbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Object nszdjne;
    
    private Object nszgjne;
    
    private Object nsjnbl;


    public Integer getNsbbh() {
        return nsbbh;
    }

    public void setNsbbh(Integer nsbbh) {
        this.nsbbh = nsbbh;
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

    public Object getNszdjne() {
        return nszdjne;
    }

    public void setNszdjne(Object nszdjne) {
        this.nszdjne = nszdjne;
    }

    public Object getNszgjne() {
        return nszgjne;
    }

    public void setNszgjne(Object nszgjne) {
        this.nszgjne = nszgjne;
    }

    public Object getNsjnbl() {
        return nsjnbl;
    }

    public void setNsjnbl(Object nsjnbl) {
        this.nsjnbl = nsjnbl;
    }

}

