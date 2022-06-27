package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Khmb {
    @TableId
    private Integer khmbid;
    private String khmbname;
    private Integer khmbnum;
    private Integer ybh;
    private String rzname;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date khmbtime;
}
