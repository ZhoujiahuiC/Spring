package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Jiaqishenqibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Jiaqishenqibiao implements Serializable {
    private static final long serialVersionUID = -92151149552371710L;
    
    private Integer jqsqbh;
    
    private Integer shjlbh;
    
    private Integer kqjqbh;
    
    private Integer shbid;
    
    private Date jqsqkssj;
    
    private Date jqsqjssj;


    public Integer getJqsqbh() {
        return jqsqbh;
    }

    public void setJqsqbh(Integer jqsqbh) {
        this.jqsqbh = jqsqbh;
    }

    public Integer getShjlbh() {
        return shjlbh;
    }

    public void setShjlbh(Integer shjlbh) {
        this.shjlbh = shjlbh;
    }

    public Integer getKqjqbh() {
        return kqjqbh;
    }

    public void setKqjqbh(Integer kqjqbh) {
        this.kqjqbh = kqjqbh;
    }

    public Integer getShbid() {
        return shbid;
    }

    public void setShbid(Integer shbid) {
        this.shbid = shbid;
    }

    public Date getJqsqkssj() {
        return jqsqkssj;
    }

    public void setJqsqkssj(Date jqsqkssj) {
        this.jqsqkssj = jqsqkssj;
    }

    public Date getJqsqjssj() {
        return jqsqjssj;
    }

    public void setJqsqjssj(Date jqsqjssj) {
        this.jqsqjssj = jqsqjssj;
    }

}

