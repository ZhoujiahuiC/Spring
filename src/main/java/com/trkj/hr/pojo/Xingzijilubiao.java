package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (Xingzijilubiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Xingzijilubiao implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer xzjlbh;

    private Integer ybh;

    private Integer shbid;

    private Integer shjlbh;

    private Double xzjljbgz;

    private Double jxgz;

    private Double xzjlsb;

    private Double szjlqj;

    private Double szjlze;

    private Double szjlsh;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date szjlsj;
    private int khid;
    @TableField(exist = false)
    private Yuangongbiao yuangongbiao;
    @TableField(exist = false)
    private Rencaizibiao rencaizibiao;
    @TableField(exist = false)
    private Zhiweibiao zhiweibiao;
    @TableField(exist = false)
    private Bumenbiao bumenbiao;
    @TableField(exist = false)
    private Shebaofananbiao shebaofananbiao;
    @TableField(exist = false)
    private Nashuibiao nashuibiao;
    @TableField(exist = false)
    private Xinzijibengongzibiao xinzijibengongzibiao;
    @TableField(exist = false)
    private List<Xinziyaosuxiangbiao> xinziyaosuxiangbiaoList;
    @TableField(exist = false)
    private Kh kh;
    @TableField(exist = false)
    private Khdj khdj;
}

