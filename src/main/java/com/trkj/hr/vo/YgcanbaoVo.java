package com.trkj.hr.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.trkj.hr.pojo.Shebaojishubiao;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class YgcanbaoVo {
    private int ybh;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ygrzrq;
    private int ygzt;
    private String rzname;
    private String sex;
    private String sbmc;
    private float sbjsje;
    private String sbname;
    private String zwmc;
}
