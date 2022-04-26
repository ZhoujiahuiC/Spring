package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Bumenbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:41
 */
public class Bumenbiao implements Serializable {
    private static final long serialVersionUID = -83716182309201599L;
    
    private Integer bmbh;
    
    private String bmmc;
    
    private String bmjs;
    
    private Date bmsj;


    public Integer getBmbh() {
        return bmbh;
    }

    public void setBmbh(Integer bmbh) {
        this.bmbh = bmbh;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public String getBmjs() {
        return bmjs;
    }

    public void setBmjs(String bmjs) {
        this.bmjs = bmjs;
    }

    public Date getBmsj() {
        return bmsj;
    }

    public void setBmsj(Date bmsj) {
        this.bmsj = bmsj;
    }

}

