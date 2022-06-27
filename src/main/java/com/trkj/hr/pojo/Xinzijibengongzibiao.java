package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * (Xinzijibengongzibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Xinzijibengongzibiao  {
    @TableId(type= IdType.AUTO)
    private Integer xzjbbh;
    
    private Integer zwbh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private Double xzjbgz;
}

