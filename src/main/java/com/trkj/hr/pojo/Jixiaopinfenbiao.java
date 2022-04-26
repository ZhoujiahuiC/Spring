package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Jixiaopinfenbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jixiaopinfenbiao implements Serializable {
    private static final long serialVersionUID = -16836855765031853L;
    
    private Integer jxbh;
    
    private Integer jbh;
    
    private Integer ybh;
    
    private Date jxsj;
    
    private Integer jxfs;


    public Integer getJxbh() {
        return jxbh;
    }

    public void setJxbh(Integer jxbh) {
        this.jxbh = jxbh;
    }

    public Integer getJbh() {
        return jbh;
    }

    public void setJbh(Integer jbh) {
        this.jbh = jbh;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Date getJxsj() {
        return jxsj;
    }

    public void setJxsj(Date jxsj) {
        this.jxsj = jxsj;
    }

    public Integer getJxfs() {
        return jxfs;
    }

    public void setJxfs(Integer jxfs) {
        this.jxfs = jxfs;
    }

}

