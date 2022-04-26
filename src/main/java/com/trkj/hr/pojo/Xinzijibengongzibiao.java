package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Xinzijibengongzibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Xinzijibengongzibiao implements Serializable {
    private static final long serialVersionUID = 944344383690320093L;
    
    private Integer xzjbbh;
    
    private Integer zwbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Object xzjbgz;


    public Integer getXzjbbh() {
        return xzjbbh;
    }

    public void setXzjbbh(Integer xzjbbh) {
        this.xzjbbh = xzjbbh;
    }

    public Integer getZwbh() {
        return zwbh;
    }

    public void setZwbh(Integer zwbh) {
        this.zwbh = zwbh;
    }

    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Object getXzjbgz() {
        return xzjbgz;
    }

    public void setXzjbgz(Object xzjbgz) {
        this.xzjbgz = xzjbgz;
    }

}

