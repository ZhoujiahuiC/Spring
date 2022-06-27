package com.trkj.hr.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class LiuchengywxxVo {
    private Integer workid;
    private Integer businessid;
    private String workname;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date addtime;
    private String ygname;
    private String remark;
}
