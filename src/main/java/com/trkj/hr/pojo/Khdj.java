package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Khdj {
    @TableId(type = IdType.AUTO)
    private Integer khdjid;
    private String khdjname;
    private Integer khdjxia;
    private Integer khdjshang;
    private Double khjebl;
}
