package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shenszjxjzjx implements Serializable {
    private Integer businessid;
    private Integer ybh;
    private Date addtime;
    private Integer ybh1;
    private String yposts;
    private String xposts;
    private Double ysalary;
    private Double xsalary;
    private String remark;
    private Date endtime;
    private String businesszt;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getYbh() {
        return ybh;
    }

    public void setYbh(Integer ybh) {
        this.ybh = ybh;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getYbh1() {
        return ybh1;
    }

    public void setYbh1(Integer ybh1) {
        this.ybh1 = ybh1;
    }

    public String getYposts() {
        return yposts;
    }

    public void setYposts(String yposts) {
        this.yposts = yposts;
    }

    public String getXposts() {
        return xposts;
    }

    public void setXposts(String xposts) {
        this.xposts = xposts;
    }

    public Double getYsalary() {
        return ysalary;
    }

    public void setYsalary(Double ysalary) {
        this.ysalary = ysalary;
    }

    public Double getXsalary() {
        return xsalary;
    }

    public void setXsalary(Double xsalary) {
        this.xsalary = xsalary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getBusinesszt() {
        return businesszt;
    }

    public void setBusinesszt(String businesszt) {
        this.businesszt = businesszt;
    }
}
