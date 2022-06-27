package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (Mianshiguizhanbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Mianshiguizhanbiao  {
    @TableId(type = IdType.AUTO)
    private Integer mbh;
    
    private Integer ybh;
    
    private Integer zwbh;
    
    private String mmc;
    @TableField(exist = false)
    private int total;
    @TableField(exist = false)
    private List<Mianshiguizhanzibiao> mianshiguizhanzibiaoList;
    @TableField(exist = false)
    private Zhiweibiao zhiweibiao;
    @TableField(exist = false)
    private Bumenbiao bumenbiao;
    @TableField(exist = false)
    private Yuangongbiao yuangongbiao;
    @TableField(exist = false)
    private Rencaizibiao rencaizibiao;

}

