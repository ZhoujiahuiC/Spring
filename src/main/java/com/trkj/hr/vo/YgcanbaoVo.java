package com.trkj.hr.vo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("yuangongbiao")
public class YgcanbaoVo {
    @TableId
    private int ybh;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ygrzrq;
    private int ygzt;
    private String rzname;
    private String rzsex;
    private String sbmc;
    private float sbjsje;
    private String sbname;
    private String zwmc;
    private String bmmc;
    private float empjs;
    private Integer sbbh;
    private float sbjnbl;
    private String rzphone;
    private int iscb;
}
