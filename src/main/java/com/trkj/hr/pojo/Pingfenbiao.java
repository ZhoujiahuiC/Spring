package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Pingfenbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Pingfenbiao implements Serializable {
    private static final long serialVersionUID = -56569714038529526L;
    
    private Integer pfbh;
    
    private Integer ybh;
    
    private Integer jxbh;


    public Integer getPfbh() {
        return pfbh;
    }

    public void setPfbh(Integer pfbh) {
        this.pfbh = pfbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getJxbh() {
        return jxbh;
    }

    public void setJxbh(Integer jxbh) {
        this.jxbh = jxbh;
    }

}

