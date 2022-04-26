package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Quanxianbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Quanxianbiao implements Serializable {
    private static final long serialVersionUID = 994869634361497560L;
    
    private Integer qxbh;
    
    private String qxmc;
    
    private String qkey;


    public Integer getQxbh() {
        return qxbh;
    }

    public void setQxbh(Integer qxbh) {
        this.qxbh = qxbh;
    }

    public String getQxmc() {
        return qxmc;
    }

    public void setQxmc(String qxmc) {
        this.qxmc = qxmc;
    }

    public String getQkey() {
        return qkey;
    }

    public void setQkey(String qkey) {
        this.qkey = qkey;
    }

}

