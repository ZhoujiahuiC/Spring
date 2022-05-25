package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shenzhuanzheng implements Serializable {
    private Integer businessid;
    private Integer ybh;
    private Date addtime;
    private Integer ybh1;
    private String remark;
    private Date endtime;
    private String businesszt;
}
