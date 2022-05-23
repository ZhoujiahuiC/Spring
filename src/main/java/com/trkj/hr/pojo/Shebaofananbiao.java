package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Shebaofananbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
@TableName(value = "shebaofananbiao")
public class Shebaofananbiao  {
//    @TableId(type = IdType.AUTO)
    @TableId(type = IdType.AUTO)
    private Integer sbbh;
    
    private Integer shjlbh;
    
    private Integer shbid;
    
    private String sbmc;

    private Integer  isuse;

    @TableField("false")
    private List<Shebaojishubiao> js;
}

