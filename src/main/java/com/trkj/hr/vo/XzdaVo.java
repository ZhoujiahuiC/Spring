package com.trkj.hr.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class XzdaVo {
    @TableId(type = IdType.AUTO)
    private Integer ybh;

    private String rzname;
    private Integer zwbh;
    private Integer ygzt;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ygrzrq;

    private Double xzjbgz;

    private String rzphone;

    private String bmmc;
    private String zwmc;
}
