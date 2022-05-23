package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * (Sbzjb)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Sbzjb {
    
    private Integer sbbh;
    private Integer sbjsbh;
    @TableField("false")
    private Shebaofananbiao shebaofananbiao;
    @TableField("false")
    private Shebaojishubiao shebaojishubiao;

}

