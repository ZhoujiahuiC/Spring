package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Jixiaobiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jixiaobiao implements Serializable {
    private static final long serialVersionUID = 900274724268062836L;
    
    private Integer jbh;
    
    private Integer zwbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private String jnr;
    
    private String jmc;


    public Integer getJbh() {
        return jbh;
    }

    public void setJbh(Integer jbh) {
        this.jbh = jbh;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
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

    public String getJnr() {
        return jnr;
    }

    public void setJnr(String jnr) {
        this.jnr = jnr;
    }

    public String getJmc() {
        return jmc;
    }

    public void setJmc(String jmc) {
        this.jmc = jmc;
    }

}

