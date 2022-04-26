package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Mianshiguizhanbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Mianshiguizhanbiao implements Serializable {
    private static final long serialVersionUID = -21583424130320581L;
    
    private Integer mbh;
    
    private Integer ybh;
    
    private Integer zwbh;
    
    private String mmc;


    public Integer getMbh() {
        return mbh;
    }

    public void setMbh(Integer mbh) {
        this.mbh = mbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public String getMmc() {
        return mmc;
    }

    public void setMmc(String mmc) {
        this.mmc = mmc;
    }

}

