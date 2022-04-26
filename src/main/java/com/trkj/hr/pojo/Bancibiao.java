package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Bancibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:37:36
 */
public class Bancibiao implements Serializable {
    private static final long serialVersionUID = -82468102055496925L;
    
    private Integer bcbh;
    
    private String bcmc;
    
    private Date bckssj;
    
    private Date bcjssj;


    public Integer getBcbh() {
        return bcbh;
    }

    public void setBcbh(Integer bcbh) {
        this.bcbh = bcbh;
    }

    public String getBcmc() {
        return bcmc;
    }

    public void setBcmc(String bcmc) {
        this.bcmc = bcmc;
    }

    public Date getBckssj() {
        return bckssj;
    }

    public void setBckssj(Date bckssj) {
        this.bckssj = bckssj;
    }

    public Date getBcjssj() {
        return bcjssj;
    }

    public void setBcjssj(Date bcjssj) {
        this.bcjssj = bcjssj;
    }

}

