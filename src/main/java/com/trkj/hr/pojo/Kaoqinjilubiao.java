package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;


/**
 * (Kaoqinjilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
@TableName("Kaoqinjilubiao")
public class Kaoqinjilubiao  {
    @TableId(type = IdType.AUTO)
    private Integer kqjlbh;
    
    private Integer ybh;

    private Date kqsbdksj;
    
    private Integer kqsbzt;

    private Date kqxbdksj;
    
    private Integer kqxbzt;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date xzsj;

    private String kqcx;
}

