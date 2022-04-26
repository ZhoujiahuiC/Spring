package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Gonggaobiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Gonggaobiao implements Serializable {
    private static final long serialVersionUID = -32940964607995036L;
    
    private Integer ggbh;
    
    private Integer ybh;
    
    private String ggnr;
    
    private Date ggsj;
    
    private Integer ggyds;


    public Integer getGgbh() {
        return ggbh;
    }

    public void setGgbh(Integer ggbh) {
        this.ggbh = ggbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public String getGgnr() {
        return ggnr;
    }

    public void setGgnr(String ggnr) {
        this.ggnr = ggnr;
    }

    public Date getGgsj() {
        return ggsj;
    }

    public void setGgsj(Date ggsj) {
        this.ggsj = ggsj;
    }

    public Integer getGgyds() {
        return ggyds;
    }

    public void setGgyds(Integer ggyds) {
        this.ggyds = ggyds;
    }

}

