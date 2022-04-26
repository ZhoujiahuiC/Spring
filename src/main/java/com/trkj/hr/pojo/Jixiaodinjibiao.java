package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Jixiaodinjibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jixiaodinjibiao implements Serializable {
    private static final long serialVersionUID = 106324896025630296L;
    
    private Integer jdbh;
    
    private String jdjb;
    
    private Integer jdfs;


    public Integer getJdbh() {
        return jdbh;
    }

    public void setJdbh(Integer jdbh) {
        this.jdbh = jdbh;
    }

    public String getJdjb() {
        return jdjb;
    }

    public void setJdjb(String jdjb) {
        this.jdjb = jdjb;
    }

    public Integer getJdfs() {
        return jdfs;
    }

    public void setJdfs(Integer jdfs) {
        this.jdfs = jdfs;
    }

}

