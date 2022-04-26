package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Shenhesxqxbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shenhesxqxbiao implements Serializable {
    private static final long serialVersionUID = 372548486461585984L;
    
    private Integer shsxid;
    
    private Integer shbid;
    
    private Integer jsbh;


    public Integer getShsxid() {
        return shsxid;
    }

    public void setShsxid(Integer shsxid) {
        this.shsxid = shsxid;
    }

    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Integer getJsbh() {
        return jsbh;
    }

    public void setJsbh(Integer jsbh) {
        this.jsbh = jsbh;
    }

}

