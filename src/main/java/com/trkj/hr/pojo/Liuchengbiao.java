package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Liuchengbiao implements Serializable {
    @TableId
    private Integer workid;
    private String workname;
    private String workdesc;
    private Integer workzt;

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getWorkdesc() {
        return workdesc;
    }

    public void setWorkdesc(String workdesc) {
        this.workdesc = workdesc;
    }

    public Integer getWorkzt() {
        return workzt;
    }

    public void setWorkzt(Integer workzt) {
        this.workzt = workzt;
    }
}
