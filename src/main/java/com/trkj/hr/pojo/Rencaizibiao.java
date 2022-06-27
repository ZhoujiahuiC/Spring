package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * (Rencaizibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
@TableName("rencaizibiao")
public class Rencaizibiao  {

    @TableId(type = IdType.AUTO)
    private Integer rzbh;

    private Integer bmbh;
    
    private String rzname;
    
    private String rzsex;
    
    private Date rzcsrq;
    
    private Integer rzage;
    
    private String rzxl;
    
    private String rzsfz;
    
    private String rzphone;
    
    private String rzdz;
    
    private String rzgzjl;
    
    private String rzhyzk;
    
    private String rzmz;
    
    private String rzzzmm;

    private String rzqqyx;
    @TableField("false")
    private Integer nan;
    @TableField("false")
    private Integer nv;

}

