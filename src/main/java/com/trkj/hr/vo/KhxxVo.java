package com.trkj.hr.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class KhxxVo {
    @TableId
    private Integer khid;
    private Integer khmbid;
    private Integer khybh;
    private Integer bmbh;
    private Integer ybh;
    @JsonFormat(pattern="yyyy-MM",timezone = "GMT+8")
    private Date khmonth;
    private String remark;
    private Integer khdjid;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date khtime;
    private double khnumc;
    private double khnumd;
    private double khnume;
    private Integer khzt;
    private String khmbname;
    private String rzname;
    private Integer khmbnum;

}
