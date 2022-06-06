package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Gonggaobiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Gonggaobiao {
    @TableId(type = IdType.AUTO)
    private Integer ggbh;
    
    private Integer ybh;

    private String ggname;

    private String ggzt;
    
    private String ggnr;
    
    private Date ggksrq;

    private Date ggjsrq;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ggfbsj;
    
    private Integer ggyds;

}

