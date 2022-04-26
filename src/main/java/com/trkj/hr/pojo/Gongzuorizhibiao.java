package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Gongzuorizhibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Gongzuorizhibiao implements Serializable {
    private static final long serialVersionUID = 914798817872323820L;
    
    private Integer gzrzbh;
    
    private Integer ybh;
    
    private String gzrznr;
    
    private Date gzrzsj;


    public Integer getGzrzbh() {
        return gzrzbh;
    }

    public void setGzrzbh(Integer gzrzbh) {
        this.gzrzbh = gzrzbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public String getGzrznr() {
        return gzrznr;
    }

    public void setGzrznr(String gzrznr) {
        this.gzrznr = gzrznr;
    }

    public Date getGzrzsj() {
        return gzrzsj;
    }

    public void setGzrzsj(Date gzrzsj) {
        this.gzrzsj = gzrzsj;
    }

}

