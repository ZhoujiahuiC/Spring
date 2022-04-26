package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Userandrole)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Userandrole implements Serializable {
    private static final long serialVersionUID = 139317625420002930L;
    
    private Integer jsbh;
    
    private Integer ybh;


    public Integer getJsbh() {
        return jsbh;
    }

    public void setJsbh(Integer jsbh) {
        this.jsbh = jsbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

}

