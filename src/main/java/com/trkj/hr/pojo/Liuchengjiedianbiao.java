package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Liuchengjiedianbiao implements Serializable {
    @TableId
    private Integer nodeid;
    private Integer workid;
    private String nodename;
    private Integer ybh;

}
