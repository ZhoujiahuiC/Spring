package com.trkj.hr.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Chuchaibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Chuchaibiao implements Serializable {
    private static final long serialVersionUID = 792470116273153762L;
    
    private Integer cbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private String ccfd;
    
    private String cmdd;
    
    private Date ckssj;
    
    private Date cyjsj;
    
    private Date csjsj;
    
    private Integer czt;
    
    private String cccnr;


    public Integer getCbh() {
        return cbh;
    }

    public void setCbh(Integer cbh) {
        this.cbh = cbh;
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

    public String getCcfd() {
        return ccfd;
    }

    public void setCcfd(String ccfd) {
        this.ccfd = ccfd;
    }

    public String getCmdd() {
        return cmdd;
    }

    public void setCmdd(String cmdd) {
        this.cmdd = cmdd;
    }

    public Date getCkssj() {
        return ckssj;
    }

    public void setCkssj(Date ckssj) {
        this.ckssj = ckssj;
    }

    public Date getCyjsj() {
        return cyjsj;
    }

    public void setCyjsj(Date cyjsj) {
        this.cyjsj = cyjsj;
    }

    public Date getCsjsj() {
        return csjsj;
    }

    public void setCsjsj(Date csjsj) {
        this.csjsj = csjsj;
    }

    public Integer getCzt() {
        return czt;
    }

    public void setCzt(Integer czt) {
        this.czt = czt;
    }

    public String getCccnr() {
        return cccnr;
    }

    public void setCccnr(String cccnr) {
        this.cccnr = cccnr;
    }

}

