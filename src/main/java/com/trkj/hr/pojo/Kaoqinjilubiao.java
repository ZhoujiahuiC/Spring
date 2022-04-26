package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Kaoqinjilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Kaoqinjilubiao implements Serializable {
    private static final long serialVersionUID = -81796200603414517L;
    
    private Integer kqjlbh;
    
    private Integer ybh;
    
    private Date kqsbdksj;
    
    private Integer kqsbzt;
    
    private Date kqxbdksj;
    
    private Integer kqxbzt;
    
    private Date xzsj;


    public Integer getKqjlbh() {
        return kqjlbh;
    }

    public void setKqjlbh(Integer kqjlbh) {
        this.kqjlbh = kqjlbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Date getKqsbdksj() {
        return kqsbdksj;
    }

    public void setKqsbdksj(Date kqsbdksj) {
        this.kqsbdksj = kqsbdksj;
    }

    public Integer getKqsbzt() {
        return kqsbzt;
    }

    public void setKqsbzt(Integer kqsbzt) {
        this.kqsbzt = kqsbzt;
    }

    public Date getKqxbdksj() {
        return kqxbdksj;
    }

    public void setKqxbdksj(Date kqxbdksj) {
        this.kqxbdksj = kqxbdksj;
    }

    public Integer getKqxbzt() {
        return kqxbzt;
    }

    public void setKqxbzt(Integer kqxbzt) {
        this.kqxbzt = kqxbzt;
    }

    public Date getXzsj() {
        return xzsj;
    }

    public void setXzsj(Date xzsj) {
        this.xzsj = xzsj;
    }

}

