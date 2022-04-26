package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Xinziyaosuxiangbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Xinziyaosuxiangbiao implements Serializable {
    private static final long serialVersionUID = -41234833300165503L;
    
    private Integer xzysbh;
    
    private String xzysmc;
    
    private Object xzysje;


    public Integer getXzysbh() {
        return xzysbh;
    }

    public void setXzysbh(Integer xzysbh) {
        this.xzysbh = xzysbh;
    }

    public String getXzysmc() {
        return xzysmc;
    }

    public void setXzysmc(String xzysmc) {
        this.xzysmc = xzysmc;
    }

    public Object getXzysje() {
        return xzysje;
    }

    public void setXzysje(Object xzysje) {
        this.xzysje = xzysje;
    }

}

