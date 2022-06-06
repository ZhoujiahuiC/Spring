package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shenzhaopin implements Serializable {
    private Integer businessid;
    private Integer ybh;
    private Date addtime;
    private String posts;
    private Integer ponum;
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

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public Integer getPonum() {
        return ponum;
    }

    public void setPonum(Integer ponum) {
        this.ponum = ponum;
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
