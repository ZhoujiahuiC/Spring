package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Xingzijilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Xingzijilubiao   {
    @TableId
    private Integer xzjlbh;
    
    private Integer ybh;
    
    private Integer shbid;
    
    private Integer shjlbh;
    
    private double xzjljbgz;
    
    private double xzjlsb;
    
    private double szjlqj;
    
    private double szjlze;
    
    private double szjlsh;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date szjlsj;


}

