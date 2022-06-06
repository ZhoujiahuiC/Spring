package com.trkj.hr.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BumenJbgzb {

    private Integer bmbh;

    private String bmmc;

    private String bmjs;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date bmsj;

    private Integer zwbh;

    private String zwjs;

    private String zwmc;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date zwsj;
    @TableId(type = IdType.AUTO)
    private Integer xzjbbh;

    private Integer shbid;

    private Integer shjlbh;

    private Double xzjbgz;
}
