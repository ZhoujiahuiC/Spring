package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Liuchengyewu implements Serializable {
    private Integer yewuid;
    private Integer workid;
    private Integer businessid;
    private Integer nodeid;
    private String suggestion;
    private Integer ybh;
    private Date endtime;
    private Integer yewuzt;
}
