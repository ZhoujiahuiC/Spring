package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

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
    
    private Date bmsj;




}

