package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * (Nashuibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Nashuibiao implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer nsbbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Double nszdjne;
    
    private Double nszgjne;
    
    private Double nsjnbl;




}

