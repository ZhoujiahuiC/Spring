package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Zhaopingjihuabiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Zhaopingjihuabiao  {
    @TableId(type = IdType.AUTO)
    private Integer zbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private Integer zwbh;
    
    private Integer zrs;
    
    private String zmc;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date zsj;

    private Integer zzt;

    private  Integer zdqrs;

    private  String zjs;

    @TableField(exist = false)
    private String zwmc;



}

