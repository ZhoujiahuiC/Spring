package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Rencaibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Rencaibiao implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer rid;
    
    private Integer ybh;
    
    private Integer zwbh;
    
    private Integer rzbh;
    
    private Integer rzt;
    
    private Date rsj;
    
    private String rsf;
    @TableField(exist = false)
    private Rencaizibiao rencaizibiao;
}

