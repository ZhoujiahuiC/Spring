package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * (Bumenbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:41
 */
@Data
@TableName("bumenbiao")
public class Bumenbiao {

    @TableId(type = IdType.AUTO)
    private Integer bmbh;
    
    private String bmmc;
    
    private String bmjs;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date bmsj;
    @TableField(exist = false)
    private int total;
    @TableField(exist = false)
    private List<Zhaopingjihuabiao> zhaopingjihuabiaoList;
    @TableField("false")
    private List<Rencaizibiao> rzList;



}

