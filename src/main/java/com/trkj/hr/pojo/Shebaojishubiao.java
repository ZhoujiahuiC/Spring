package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * (Shebaojishubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Shebaojishubiao  {
    @TableId(type = IdType.AUTO)
    private Integer sbjsbh;
    
    private Integer shjlbh;
    
    private Integer shbid;

    private String sbname;

    private  float sbjsje;

    private  float sbjnbl;


}

