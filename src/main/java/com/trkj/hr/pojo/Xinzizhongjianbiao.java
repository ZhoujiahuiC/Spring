package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Xinzizhongjianbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Xinzizhongjianbiao implements Serializable {
    private static final long serialVersionUID = -10876105027729530L;
    
    private Integer xzzjbh;
    
    private Integer ybh;
    
    private Integer xzysbh;
    
    private Integer xzzjsl;
    
    private Date xzsj;


    public Integer getXzzjbh() {
        return xzzjbh;
    }

    public void setXzzjbh(Integer xzzjbh) {
        this.xzzjbh = xzzjbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getXzysbh() {
        return xzysbh;
    }

    public void setXzysbh(Integer xzysbh) {
        this.xzysbh = xzysbh;
    }

    public Integer getXzzjsl() {
        return xzzjsl;
    }

    public void setXzzjsl(Integer xzzjsl) {
        this.xzzjsl = xzzjsl;
    }

    public Date getXzsj() {
        return xzsj;
    }

    public void setXzsj(Date xzsj) {
        this.xzsj = xzsj;
    }

}

