package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Shenghebiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shenghebiao implements Serializable {
    private static final long serialVersionUID = 284221734693038151L;
    
    private Integer shbid;
    
    private Integer qxbh;
    
    private String shbmc;


    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Integer getQxbh() {
        return qxbh;
    }

    public void setQxbh(Integer qxbh) {
        this.qxbh = qxbh;
    }

    public String getShbmc() {
        return shbmc;
    }

    public void setShbmc(String shbmc) {
        this.shbmc = shbmc;
    }

}

