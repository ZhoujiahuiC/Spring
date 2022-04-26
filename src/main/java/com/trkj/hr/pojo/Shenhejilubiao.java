package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Shenhejilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Shenhejilubiao implements Serializable {
    private static final long serialVersionUID = 784372466589693230L;
    
    private Integer shjlbh;
    
    private Integer ybh;
    
    private Integer shjlzt;
    
    private Date shjlsj;


    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Integer getShjlzt() {
        return shjlzt;
    }

    public void setShjlzt(Integer shjlzt) {
        this.shjlzt = shjlzt;
    }

    public Date getShjlsj() {
        return shjlsj;
    }

    public void setShjlsj(Date shjlsj) {
        this.shjlsj = shjlsj;
    }

}

