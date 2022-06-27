package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (Xinzizhongjianbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Xinzizhongjianbiao implements Serializable {

    private Integer xzzjbh;
    
    private Integer ybh;
    
    private Integer xzysbh;
    
    private Integer xzzjsl;
    
    private Date xzsj;

    @TableField(exist = false)
    private Xinziyaosuxiangbiao xinziyaosuxiangbiao;


}

