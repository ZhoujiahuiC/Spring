package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Xinzijiluzibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Xinzijiluzibiao implements Serializable {
    private static final long serialVersionUID = 972166410014497845L;
    
    private Integer xzzjbh;
    
    private Integer xzjlbh;


    public Integer getXzzjbh() {
        return xzzjbh;
    }

    public void setXzzjbh(Integer xzzjbh) {
        this.xzzjbh = xzzjbh;
    }

    public Integer getXzjlbh() {
        return xzjlbh;
    }

    public void setXzjlbh(Integer xzjlbh) {
        this.xzjlbh = xzjlbh;
    }

}

