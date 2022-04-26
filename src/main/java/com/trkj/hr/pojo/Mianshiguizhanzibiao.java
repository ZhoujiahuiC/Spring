package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Mianshiguizhanzibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Mianshiguizhanzibiao implements Serializable {
    private static final long serialVersionUID = -75065725658938776L;
    
    private Integer mzbh;
    
    private Integer mbh;
    
    private Integer ybh;
    
    private String mzwt;


    public Integer getMzbh() {
        return mzbh;
    }

    public void setMzbh(Integer mzbh) {
        this.mzbh = mzbh;
    }

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

    public String getMzwt() {
        return mzwt;
    }

    public void setMzwt(String mzwt) {
        this.mzwt = mzwt;
    }

}

