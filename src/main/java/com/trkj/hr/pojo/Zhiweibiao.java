package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Zhiweibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Zhiweibiao implements Serializable {
    private static final long serialVersionUID = -95282544353001411L;
    
    private Integer zwbh;
    
    private Integer bmbh;
    
    private String zwjs;
    
    private String zwmc;
    
    private Date zwsj;


    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public Integer getBmbh() {
        return bmbh;
    }

    public void setBmbh(Integer bmbh) {
        this.bmbh = bmbh;
    }

    public String getZwjs() {
        return zwjs;
    }

    public void setZwjs(String zwjs) {
        this.zwjs = zwjs;
    }

    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc;
    }

    public Date getZwsj() {
        return zwsj;
    }

    public void setZwsj(Date zwsj) {
        this.zwsj = zwsj;
    }

}

