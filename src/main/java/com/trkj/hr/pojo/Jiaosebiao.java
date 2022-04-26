package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Jiaosebiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jiaosebiao implements Serializable {
    private static final long serialVersionUID = -88421473069537304L;
    
    private Integer jsbh;
    
    private String jsmc;
    
    private String jkey;


    public Integer getJsbh() {
        return jsbh;
    }

    public void setJsbh(Integer jsbh) {
        this.jsbh = jsbh;
    }

    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc;
    }

    public String getJkey() {
        return jkey;
    }

    public void setJkey(String jkey) {
        this.jkey = jkey;
    }

}

