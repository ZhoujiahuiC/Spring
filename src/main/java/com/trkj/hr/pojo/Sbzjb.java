package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Sbzjb)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Sbzjb implements Serializable {
    private static final long serialVersionUID = -73704276631222190L;
    
    private Integer sbbh;
    
    private Integer sbjsbh;


    public Integer getSbbh() {
        return sbbh;
    }

    public void setSbbh(Integer sbbh) {
        this.sbbh = sbbh;
    }

    public Integer getSbjsbh() {
        return sbjsbh;
    }

    public void setSbjsbh(Integer sbjsbh) {
        this.sbjsbh = sbjsbh;
    }

}

