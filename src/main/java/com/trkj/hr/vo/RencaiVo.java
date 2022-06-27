package com.trkj.hr.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class RencaiVo {
    private Integer rid;

    private Integer ybh;

    private Integer zwbh;

    private Integer rzbh;

    private Integer rzt;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date rsj;

    private String rsf;

    private Integer bmbh;

    private String rzname;

    private String rzsex;

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

    private String zwmc;

    private String bmmc;
}
