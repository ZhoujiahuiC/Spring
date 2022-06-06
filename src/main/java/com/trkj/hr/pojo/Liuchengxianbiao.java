package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Liuchengxianbiao implements Serializable {
    private Integer linkid;
    private Integer workid;
    private Integer linkqiannodeid;
    private Integer linkhounodeid;
    private String linkremark;

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getLinkqiannodeid() {
        return linkqiannodeid;
    }

    public void setLinkqiannodeid(Integer linkqiannodeid) {
        this.linkqiannodeid = linkqiannodeid;
    }

    public Integer getLinkhounodeid() {
        return linkhounodeid;
    }

    public void setLinkhounodeid(Integer linkhounodeid) {
        this.linkhounodeid = linkhounodeid;
    }

    public String getLinkremark() {
        return linkremark;
    }

    public void setLinkremark(String linkremark) {
        this.linkremark = linkremark;
    }
}
