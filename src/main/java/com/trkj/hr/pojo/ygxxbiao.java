package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ygxxbiao {
    @TableId
    private Integer ybh;

    private Integer bcbh;

    private Integer rzbh;

    private Integer zwbh;

    private Integer sbbh;

    private Integer ygzt;

    private String yzh;

    private String ymm;

    private String rzname;

    private String rzsex;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date rzcsrq;

    private Integer rzage;

    private String rzxl;

    private String rzsfz;

    private String rzphone;

    private String rzdz;

    private String rzgzjl;

    private String rzhyzk;

    private String rzmz;

    private String rzzzmm;

    private String rzqqyx;

    private String sbmc;

    private String zwmc;

    private String bcmc;

    private String bckssj;

    private String bcjssj;

    private String bmmc;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ygrzrq;

    private String tp;
}
