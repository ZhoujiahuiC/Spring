package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Mianshijilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Mianshijilubiao implements Serializable {
    private static final long serialVersionUID = 753144064919675833L;
    
    private Integer mjbh;
    
    private Integer rid;
    
    private Integer ybh;
    
    private Integer mzbh;
    
    private Date mjsj;
    
    private Integer mjzt;
    
    private Date mjxcsj;


    public Integer getMjbh() {
        return mjbh;
    }

    public void setMjbh(Integer mjbh) {
        this.mjbh = mjbh;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getMzbh() {
        return mzbh;
    }

    public void setMzbh(Integer mzbh) {
        this.mzbh = mzbh;
    }

    public Date getMjsj() {
        return mjsj;
    }

    public void setMjsj(Date mjsj) {
        this.mjsj = mjsj;
    }

    public Integer getMjzt() {
        return mjzt;
    }

    public void setMjzt(Integer mjzt) {
        this.mjzt = mjzt;
    }

    public Date getMjxcsj() {
        return mjxcsj;
    }

    public void setMjxcsj(Date mjxcsj) {
        this.mjxcsj = mjxcsj;
    }

}

