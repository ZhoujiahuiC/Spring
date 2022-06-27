package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Bancibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:37:36
 */
@Data
public class Bancibiao  {
    @TableId(type = IdType.AUTO)
    private Integer bcbh;
    
    private String bcmc;
    
    private String bckssj;
    
    private String bcjssj;

    private int num;

}

