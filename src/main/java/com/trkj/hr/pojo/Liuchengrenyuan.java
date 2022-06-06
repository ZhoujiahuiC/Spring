package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Liuchengrenyuan implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer appid;
    private Integer workid;
    private Integer nodeid;
    private Integer ybh;

}
