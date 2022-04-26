package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Jiaosequanxianbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jiaosequanxianbiao implements Serializable {
    private static final long serialVersionUID = 965415381035094376L;
    
    private Integer jsbh;
    
    private Integer qxbh;


    public Integer getJsbh() {
        return jsbh;
    }

    public void setJsbh(Integer jsbh) {
        this.jsbh = jsbh;
    }

    public Integer getQxbh() {
        return qxbh;
    }

    public void setQxbh(Integer qxbh) {
        this.qxbh = qxbh;
    }

}

